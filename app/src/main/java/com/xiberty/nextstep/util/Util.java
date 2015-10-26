package com.xiberty.nextstep.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.design.widget.Snackbar;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public static String getIdDevice(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getDeviceId() == null ? "0" : telephonyManager.getDeviceId();
    }

    public static String getAndroidId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    public static String getLineNumber(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getLine1Number();
    }

    public static Date getActualDate() {
        Calendar c = Calendar.getInstance();
        return c.getTime();
    }

    public static String getCurrentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return simpleDateFormat.format(date);
    }

    public static String getIPAddress(boolean useIPv4) {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements(); ) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
        } catch (Exception ex) {
            Log.e("IP Address", ex.toString());
        }
        return "";
    }


    public static StringBuilder getSO() {
        StringBuilder builder = new StringBuilder();
        builder.append("android : ").append(Build.VERSION.RELEASE);

        Field[] fields = Build.VERSION_CODES.class.getFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            int fieldValue = -1;

            try {
                fieldValue = field.getInt(new Object());
            } catch (IllegalArgumentException | IllegalAccessException | NullPointerException e) {
                e.printStackTrace();
            }

            if (fieldValue == Build.VERSION.SDK_INT) {
                builder.append(" : ").append(fieldName).append(" : ");
                builder.append("sdk=").append(fieldValue);
            }
        }
        return builder;
    }




    public static boolean isValidEmailAddress(String emailAddress) {
        String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = emailAddress;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }


    public static String getDatabasePath(Context context) {
        return context.getFilesDir().getPath() + File.separator + "db.sqlite";
    }

    public static void copyFromAssetsToStorage(Context Context, String SourceFile, String DestinationFile) throws IOException {
        InputStream IS = Context.getAssets().open(SourceFile);
        OutputStream OS = new FileOutputStream(DestinationFile);
        copyStream(IS, OS);
        OS.flush();
        OS.close();
        IS.close();
    }

    public static void copyStream(InputStream Input, OutputStream Output) throws IOException {
        byte[] buffer = new byte[5120];
        int length = Input.read(buffer);
        while (length > 0) {
            Output.write(buffer, 0, length);
            length = Input.read(buffer);
        }
    }

    public static String toCamelCase(String data) {
        if (data == null)
            return null;
        final StringBuilder ret = new StringBuilder(data.length());

        for (final String word : data.split(" ")) {
            if (!word.isEmpty()) {
                ret.append(word.substring(0, 1).toUpperCase());
                ret.append(word.substring(1).toLowerCase());
            }
            if (!(ret.length() == data.length()))
                ret.append(" ");
        }
        return ret.toString();
    }



//    ===================================================
//    =================== SHOW DIALOG ===================
//    ===================================================

//    public static void showProgressDialog(Context context, int content) {
//        new MaterialDialog.Builder(context)
//                .content(content)
//                .progress(true, 0)
//                .progressIndeterminateStyle(false)
//                .show();
//
//        //    ===================================================
//    }

//    ==================================================================
//    ===================== SET PREFER HAS SESSION =====================
//    ==================================================================

    public static void setWithSession(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(Prefer.WITH_SESION, true);
        editor.apply();
    }

    public static void eraseWithSession(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(Prefer.WITH_SESION, false);
        editor.apply();
    }

    public static boolean getWithSession(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        return settings.getBoolean(Prefer.WITH_SESION, false);
    }


//    public static void showCredits(final Context context) {
//        String version = BuildConfig.VERSION_NAME;
//        MaterialDialog dialog = new MaterialDialog.Builder(context)
//                .title(R.string.creditos)
//                .customView(R.layout.dialog_credits, true)
//                .positiveText(R.string.aceptar)
//                .callback(new MaterialDialog.ButtonCallback() {
//                    @Override
//                    public void onPositive(MaterialDialog dialog) {
//                        dialog.hide();
//                    }
//
//                    @Override
//                    public void onNegative(MaterialDialog dialog) {
//                    }
//                }).build();
//
//
//        CreditosListAdapter mListAdapter = new CreditosListAdapter(context);
//
////      public void addItem(boolean logo_layout ,boolean item_layout, String desc_text_view, String web_text_view, boolean go_action, boolean logo_footer_layout) {
//        mListAdapter.addItem(true, false, "", "", false);
//        mListAdapter.addItem(false, true, context.getString(R.string.version), version, false);
//        mListAdapter.addItem(false, true, context.getString(R.string.sitio_web), context.getString(R.string.web_daza), false);
//        mListAdapter.addItem(false, true, context.getString(R.string.correoElec), context.getString(R.string.email_daza), false);
//        mListAdapter.addItem(false, false, "", "", true);
//
//        ListView listCredits = (ListView) dialog.getCustomView().findViewById(R.id.listCredits);
//
//        listCredits.setAdapter(mListAdapter);
//
//        listCredits.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                switch (position) {
//                    case 2:
//                        Util.openBrowser(context.getString(R.string.web_daza), context);
//                        break;
//                    case 3:
//                        Util.sendMail(context.getString(R.string.email_daza), context);
//                        break;
//                }
//            }
//        });
//        dialog.show();
//    }


//    ==================================================================
//    ============== SET PREFER NRO_DOCUMENTO CUENTA ===================
//    ==================================================================

    public static void setLastNroDocumentoCuenta(Context context, String nroDoc) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Prefer.LAST_NRO_DOCUMENTO_CUENTA, nroDoc);
        Log.e("TAG", nroDoc + " VALOR QUE LLEGA LAS LAS DOCMUENTE PREFERENCES................................................");
        editor.apply();
    }

    public static void eraseLasNroDocuemntoCuenta(Context context, String nroDoc) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Prefer.LAST_NRO_DOCUMENTO_CUENTA, "");
        editor.apply();
    }

    public static String getLastNroDocuemntoCuenta(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        return settings.getString(Prefer.LAST_NRO_DOCUMENTO_CUENTA, "");
    }

//    ==================================================================
//    ============== SET PREFER NRO_DOCUMENTO CUENTA ===================
//    ==================================================================

    public static void setFondosCuenta(Context context, String nroDoc) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Prefer.LAST_FONDOS, nroDoc);
        Log.e("TAG", nroDoc + " VALOR QUE LLEGA LAS LAS DOCMUENTE PREFERENCES................................................");
        editor.apply();
    }

    public static void eraseFonodosCuenta(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Prefer.LAST_FONDOS, "");
        editor.apply();
    }

    public static String getLastFondosCuenta(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        return settings.getString(Prefer.LAST_FONDOS, "");
    }


//    ==================================================================
//    ===================== HANDLE PREFFERENCE =========================
//    ==================================================================



    public static void savePreference(Context context, String preferenceName, String value) {


        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(preferenceName, value);
        editor.apply();

        Log.e("TAG", preferenceName + "->" + getPreference(context, preferenceName));
    }

    public static String getPreference(Context context, String preferenceName) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        return settings.getString(preferenceName, "");
    }

    public static boolean isEmptyPassword(Context context) {
        String pass = getPreference(context, Prefer.LAST_PASSWORD);
        return !(pass != null && pass.length() > 0);
    }


//    ==================================================================
//    ===================== HANDLE SOFT KEYBOARD =======================
//    ==================================================================

    public static void hideSoftKeyboard(View view, Context context) {
        try {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception ignored) {
        }
    }


//    ==================================================================
//    =========================== SET MODE USE =========================
//    ==================================================================

    public static void setMode(Context context, boolean mode) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(Prefer.MODE_USE, mode);
        Log.e("TAG", mode + " VALOR QUE LLEGA LAS LAS DOCMUENTE PREFERENCES................................................");
        editor.apply();
    }

    public static boolean getMode(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        return settings.getBoolean(Prefer.MODE_USE, false);
    }

//    ==================================================================
//    ====================== SAVE USER PREFERENCES =====================
//    ==================================================================

    public static void setLastUser(Context context, String user) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Prefer.LAST_USER, user);
        Log.e("TAG", user + " VALOR QUE LLEGA LAS LAS DOCMUENTE PREFERENCES................................................");
        editor.apply();
    }

    public static void eraseLastUser(Context context, String user) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Prefer.LAST_USER, "");
        editor.apply();
    }

    public static String getLastUser(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        return settings.getString(Prefer.LAST_USER, "");
    }

//    ==================================================================
//    ==================== SAVE PASSWORD PREFERENCES ===================
//    ==================================================================

    public static void setLastPassword(Context context, String password) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Prefer.LAST_PASSWORD, password);
        Log.e("TAG", password + " VALOR QUE LLEGA LAS LAS DOCMUENTE PREFERENCES................................................");
        editor.apply();
    }

    public static void eraseLastPassword(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Prefer.LAST_PASSWORD, "");
        editor.apply();
    }

    public static String getLastPassword(Context context) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        return settings.getString(Prefer.LAST_PASSWORD, "");
    }

//    ==================================================================
//    ===================== HANDLE BITMAPS ===================
//    ==================================================================

    // convert from bitmap to byte array
    public static byte[] getBytes(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
        return stream.toByteArray();
    }

    public static void setImageFromBitmap(Bitmap bitmap, ImageView imageView) {
        imageView.setImageBitmap(bitmap);
    }


    public static void showToast(Context context, int message) {
        try {
            Toast.makeText(context, context.getText(message), Toast.LENGTH_LONG).show();
        } catch (Exception ignored) {
        }
    }

    public static void showSnakBar(int message, View view, Context context) {
        try {
            Snackbar.make(view, context.getText(message), Snackbar.LENGTH_LONG).show();
        } catch (Exception ignored) {
        }
    }



//    =======================================================================================
//    ============================ CLEAN ALL PREFERENCES ====================================
//    =======================================================================================

    public static void cleanPreference(Context context, String tag) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(tag, "");
        editor.apply();
    }



//    =======================================================================================
//    ================================= BASE 64 ENCODE ======================================
//    =======================================================================================

    public static String encodeTobase64(Bitmap image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 50, baos);
        byte[] b = baos.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);

        Log.d("Image Log:", imageEncoded);
        return imageEncoded;
    }

    public static Bitmap decodeBase64(String input) {
        byte[] decodedByte = Base64.decode(input, 0);
        return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
    }

    public static String getImageBitmap(Context context, String tag) {
        SharedPreferences settings = context.getSharedPreferences(Prefer.NAME_PREFERENCES, 0);
        return settings.getString(tag, "");
    }



    public static void openBrowser(String url, Context context) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://" + url));
        context.startActivity(i);
    }

//    public static void sendMail(String mail, Context context) {
//        Intent i = new Intent(Intent.ACTION_SEND);
//        i.setType("message/rfc822");
//        i.putExtra(Intent.EXTRA_EMAIL, new String[]{mail});
//        i.putExtra(Intent.EXTRA_SUBJECT, R.string.asunto_correo);
//        i.putExtra(Intent.EXTRA_TEXT, R.string.mensaje_correo);
//        try {
//            context.startActivity(Intent.createChooser(i, context.getString(R.string.correoElectronico)));
//        } catch (android.content.ActivityNotFoundException ex) {
//            Util.showToast(context, R.string.noExisteUnClienteDeCorreo);
//        }
//    }


    private static boolean isValidEmail(String correo) {
        if (correo.length() > 0) {
            if (Util.isValidEmailAddress(correo)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }



    public static String saveFile(Context context, Bitmap bm, String path) {

        // Context.getFilesDir().getPath() + File.separator + "db.sqlite"
        //create a file to write bitmap data
        Log.e("NAME>", path);

//        String destinationFile = context.getFilesDir().getPath() + File.separator + name;
        File f = new File(path);

        Log.e("ROUTE>", context.getFilesDir().getPath());
//        Log.e("DESTINATION>", destinationFile);
        try {
            f.createNewFile();
            //Convert bitmap to byte array
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bm.compress(Bitmap.CompressFormat.JPEG, 50, bos);
            byte[] bitmapdata = bos.toByteArray();

            //write the bytes in file
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(bitmapdata);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }


    public static void cleanReferencesPreferences(Context context){
        cleanPreference(context, Prefer.REF_PER_DOCUMENTO);
        cleanPreference(context, Prefer.REF_TIPO);
        cleanPreference(context, Prefer.REF_INSTITUCION);
        cleanPreference(context, Prefer.REF_CUENTA);
        cleanPreference(context, Prefer.REF_CONTACTO);
        cleanPreference(context, Prefer.REF_NRO_CONTACTO);
        cleanPreference(context, Prefer.REF_CIUDAD);
        cleanPreference(context, Prefer.REF_PAIS);
        cleanPreference(context, Prefer.REF_CELULAR);
    }


   public static Bitmap getPreview(String uri) {
//        File image = new File(uri);

        BitmapFactory.Options bounds = new BitmapFactory.Options();
        bounds.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri, bounds);
        if ((bounds.outWidth == -1) || (bounds.outHeight == -1))
            return null;

        int originalSize = (bounds.outHeight > bounds.outWidth) ? bounds.outHeight
                : bounds.outWidth;

        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inSampleSize = originalSize / 168;
        return BitmapFactory.decodeFile(uri, opts);
    }

}
