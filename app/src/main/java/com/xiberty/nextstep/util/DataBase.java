package com.xiberty.nextstep.util;

import android.content.Context;

import com.xiberty.nextstep.models.Oferta;

import java.util.ArrayList;

/**
 * Created by hrengel on 23/7/15.
 */

public class DataBase {

    private static Context mContext;

    public DataBase(Context context) {
        this.mContext = context;
    }


    public ArrayList<Oferta> getDataOferta(){

        ArrayList<Oferta> ofertas = new ArrayList<>();



        return ofertas;
    }

//    public static ArrayList<DataSpinner> getDataSpinner(String tableName, boolean isFirstItem) {
//        String sql = "SELECT * FROM " + tableName + " ORDER BY rowid";
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        Cursor cursor = mDb.rawQuery(sql, null);
//
//        ArrayList<DataSpinner> dataSpinners = new ArrayList<>();
//
//        if (isFirstItem) {
//            DataSpinner dataSpinner1 = new DataSpinner();
//            dataSpinner1.setCode(mContext.getString(R.string.selec));
//            dataSpinner1.setValue(mContext.getString(R.string.selec));
//
//            dataSpinners.add(dataSpinner1);
//        }
//
//        if (cursor.moveToFirst()) {
//            do {
//                DataSpinner dataSpinner = new DataSpinner();
//                dataSpinner.setCode(cursor.getString(1));
//                dataSpinner.setValue(cursor.getString(2));
//
//                dataSpinners.add(dataSpinner);
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return dataSpinners;
//    }
//
//    public static ArrayList<DataSpinnerDependent> getDataSpinnerDependent(String tableName, boolean isFirstItem, String idDependent) {
//        String sql = "SELECT * FROM " + tableName + " WHERE code_dependent=?" + " ORDER BY value";
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        String[] parameters = {idDependent};
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//
//        ArrayList<DataSpinnerDependent> dataSpinners = new ArrayList<>();
//
//        if (isFirstItem) {
//            DataSpinnerDependent dataSpinnerDependent1 = new DataSpinnerDependent();
//            dataSpinnerDependent1.setCode(mContext.getString(R.string.selec));
//            dataSpinnerDependent1.setValue(mContext.getString(R.string.selec));
//
//            dataSpinners.add(dataSpinnerDependent1);
//        }
//
//        if (cursor.moveToFirst()) {
//            do {
//                DataSpinnerDependent dataSpinnerDependent = new DataSpinnerDependent();
//                dataSpinnerDependent.setDependentCode(cursor.getString(1));
//                dataSpinnerDependent.setCode(cursor.getString(2));
//                dataSpinnerDependent.setValue(cursor.getString(3));
//
//                dataSpinners.add(dataSpinnerDependent);
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return dataSpinners;
//    }
//
//    public static ArrayList<DataSpinnerPersona> getDataPersona() {
//        String sql = "SELECT " +
//                DB.per_nombre + ", " +
//                DB.per_paterno + ", " +
//                DB.per_materno + ", " +
//                DB.per_documento +
//                " FROM " + DB.table_persona + " WHERE " + DB.per_state + "=?" + " ORDER BY " + DB.per_nombre;
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        String[] parameters = {"1"};
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//
//        ArrayList<DataSpinnerPersona> dataSpinners = new ArrayList<>();
//
//        DataSpinnerPersona dataSpinnerPersona = new DataSpinnerPersona();
//        dataSpinnerPersona.setDocumento(mContext.getString(R.string.selec));
//        dataSpinnerPersona.setNombre(mContext.getString(R.string.selec));
//
//        dataSpinners.add(dataSpinnerPersona);
//
//        if (cursor.moveToFirst()) {
//            do {
//                DataSpinnerPersona spinnerPersona = new DataSpinnerPersona();
//                spinnerPersona.setNombre(cursor.getString(3) + " - " + cursor.getString(0) + " " + cursor.getString(1) + " " + cursor.getString(2));
//                spinnerPersona.setDocumento(cursor.getString(3));
//
//                dataSpinners.add(spinnerPersona);
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return dataSpinners;
//    }
//
//    public static ArrayList<DataSpinner> getDataSpinnerFunds(boolean isFirstItem) {
//        String sql = "SELECT " + DB.funds_code + ", " + DB.funds_name + " FROM " + DB.table_funds + " ORDER BY " + DB.funds_code;
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        Cursor cursor = mDb.rawQuery(sql, null);
//
//        ArrayList<DataSpinner> dataSpinners = new ArrayList<>();
//
//        if (isFirstItem) {
//            DataSpinner dataSpinner1 = new DataSpinner();
//            dataSpinner1.setCode(mContext.getString(R.string.selec));
//            dataSpinner1.setValue(mContext.getString(R.string.selec));
//
//            dataSpinners.add(dataSpinner1);
//        }
//
//        if (cursor.moveToFirst()) {
//            do {
//                DataSpinner dataSpinner = new DataSpinner();
//                dataSpinner.setCode(cursor.getString(0));
//                dataSpinner.setValue(cursor.getString(1));
//
//                dataSpinners.add(dataSpinner);
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return dataSpinners;
//    }
//
//    public static ArrayList<String> getFundsName() {
//        String sql = "SELECT " + DB.funds_state + ", " + DB.funds_name +
//                " FROM " + DB.table_funds +
//                " WHERE " + DB.funds_state + "=" + "'" + "E" + "'" +
//                " ORDER BY " + DB.funds_name;
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        Cursor cursor = mDb.rawQuery(sql, null);
//
//        ArrayList<String> data = new ArrayList<>();
//
//        if (cursor.moveToFirst()) {
//            do {
//                data.add(cursor.getString(1));
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return data;
//    }
//
//
//    public String getValueFomDB(String code, String table_name) {
//        String affiliatedFunds = "";
//        String sql = "SELECT value " +
//                " FROM " + table_name +
//                " WHERE code" + "=?";
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        String[] parameters = {code};
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//
//        if (cursor.moveToFirst()) {
//            do {
//                affiliatedFunds = cursor.getString(0);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return affiliatedFunds;
//    }
//
//
//    public String getNameFromDoc(String nroDocumento) {
//        String nombre = "";
//        String sql = "SELECT " + DB.per_nombre + ", " +
//                DB.per_paterno + ", " +
//                DB.per_materno +
//                " FROM " + DB.table_persona +
//                " WHERE " + DB.per_documento + "=?";
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        String[] parameters = {nroDocumento};
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//
//        if (cursor.moveToFirst()) {
//            do {
//                nombre = cursor.getString(0) + " " + cursor.getString(1) + " " + cursor.getString(2);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return nombre;
//    }
//
//    public String getNombreFund(String code) {
//        String affiliatedFunds = "";
//        String sql = "SELECT " + DB.funds_name +
//                " FROM " + DB.table_funds +
//                " WHERE " + DB.funds_code + "=?";
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        String[] parameters = {code};
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//
//        if (cursor.moveToFirst()) {
//            do {
//                affiliatedFunds = cursor.getString(0);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return affiliatedFunds;
//    }
//
//
//
//    public boolean checkExistPerson(String nroDocumento) {
//        String sql = "SELECT " + DB.per_documento +
//                " FROM " + DB.table_persona +
//                " WHERE " + DB.per_documento + "=?";
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        String[] parameters = {nroDocumento};
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//
//        if (cursor.moveToFirst()) {
//            return true;
//        }
//        cursor.close();
//        mDb.close();
//
//        return false;
//    }
//
//    public boolean updateDataSpinners(Context context, String fieldName, String updateData) {
//
//        String[] selection = new String[]{Util.getPreference(context, Prefer.PER_DOCUMENTO)};
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(context), null);
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(fieldName, updateData);
//
//        boolean result = mDb.update(DB.table_persona, contentValues,
//                DB.per_documento + " =?  "
//                , selection) > 0;
//        mDb.close();
//        L.e(this, result + " UPDATE AFFILIATIONS FUNDS...................");
//
//        return result;
//    }
//
//    public ArrayList<Persona> getNoSyncPersonas() {
//
//        ArrayList<Persona> personas = new ArrayList<>();
//        String[] parameters = {"1", "1"};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.per_documento + ", " +
//                DB.per_tipo_documento + ", " +
//                DB.per_expedido_en + ", " +
//                DB.per_nombre + ", " +
//                DB.per_paterno + ", " +
//                DB.per_materno + ", " +
//                DB.per_ap_casada + ", " +
//                DB.per_nit + ", " +
//                DB.per_fecha_nacimiento + ", " +
//                DB.per_fecha_venc_doc + ", " +
//                DB.per_fecha_act_info + ", " +
//                DB.per_sexo + ", " +
//                DB.per_estado_civil + ", " +
//                DB.per_nacionalidad + ", " +
//                DB.per_pais + ", " +
//                DB.per_avatar + ", " +
//                DB.per_signature + ", " +
//                DB.per_grado_instruccion + ", " +
//                DB.per_profesion + ", " +
//                DB.per_sector_economico + ", " +
//                DB.per_actividad_economica + ", " +
//                DB.per_nombre_conyugue + ", " +
//                DB.per_tipo_residente + ", " +
//                DB.per_departamento + ", " +
//                DB.per_ciudad + ", " +
//                DB.per_zona + ", " +
//                DB.per_ext_ciudad + ", " +
//                DB.per_ext_estado + ", " +
//                DB.per_ext_pais + ", " +
//                DB.per_lugar_nacimiento + ", " +
//                DB.per_localidad + ", " +
//                DB.per_barrio + ", " +
//                DB.per_direccion + ", " +
//                DB.per_nro_puerta + ", " +
//                DB.per_edificio + ", " +
//                DB.per_nro_piso + ", " +
//                DB.per_nro_departamento + ", " +
//                DB.per_correo_electronico + ", " +
//                DB.per_telf_cod_pais + ", " +
//                DB.per_telf + ", " +
//                DB.per_celular + ", " +
//                DB.per_fax + ", " +
//                DB.per_tra_actividad_economica + ", " +
//                DB.per_tra_datos_empresa + ", " +
//                DB.per_tra_sector_economico + ", " +
//                DB.per_tra_lugar_trabajo + ", " +
//                DB.per_tra_cargo + ", " +
//                DB.per_tra_fecha_ingreso + ", " +
//                DB.per_tra_situacion_laboral + ", " +
//                DB.per_tra_ingresos_anuales + ", " +
//                DB.per_tra_origen_fondos + ", " +
//                DB.per_tra_detalle_origen_fondos + ", " +
//                DB.per_tra_tipo_residente + ", " +
//                DB.per_tra_ciudad_recidencia + ", " +
//                DB.per_tra_localidad + ", " +
//                DB.per_tra_zona + ", " +
//                DB.per_tra_direccion + ", " +
//                DB.per_tra_nro_puerta + ", " +
//                DB.per_tra_edificio + ", " +
//                DB.per_tra_nro_piso + ", " +
//                DB.per_tra_nro_departamento + ", " +
//                DB.per_tra_telf_1 + ", " +
//                DB.per_tra_telf_2 + ", " +
//                DB.per_tra_telf_3 + ", " +
//                DB.per_tra_telf_4 + ", " +
//                DB.per_tra_telf_5 + ", " +
//                DB.per_tra_fax + ", " +
//                DB.per_tra_casilla + ", " +
//                DB.per_tra_correo_electronico + ", " +
//                DB.per_affiliated_funds + ", " +
//                DB.per_affiliated_funds_names + ", " +
//                DB.per_observaciones + ", " +
//                DB.sync_photo_state + ", " +
//                DB.sync_signature_state + ", " +
//                DB.per_affiliated_funds + ", " +
//                DB.per_state + ", " +
//                DB.per_sync +
//                " FROM " + DB.table_persona +
//                " WHERE " + DB.per_state + "=?" +
//                " AND " + DB.per_sync + "!=?" +
//                " OR " + DB.per_sync + " IS NULL";
//
//        Log.e("TAG", sql);
//
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//                Persona persona = new Persona();
//                persona.setDoc(cursor.getString(cursor.getColumnIndex(DB.per_documento)));
//                persona.setTipoDoc(cursor.getString(cursor.getColumnIndex(DB.per_tipo_documento)));
//                persona.setDocExpedido(cursor.getString(cursor.getColumnIndex(DB.per_expedido_en)));
//                persona.setNombres(cursor.getString(cursor.getColumnIndex(DB.per_nombre)));
//                persona.setPaterno(cursor.getString(cursor.getColumnIndex(DB.per_paterno)));
//                persona.setMaterno(cursor.getString(cursor.getColumnIndex(DB.per_materno)));
//                persona.setApeCasada(cursor.getString(cursor.getColumnIndex(DB.per_ap_casada)));
//                persona.setNit(cursor.getString(cursor.getColumnIndex(DB.per_nit)));
//                persona.setSexo(cursor.getString(cursor.getColumnIndex(DB.per_sexo)));
//                persona.setEstadoCivil(cursor.getString(cursor.getColumnIndex(DB.per_estado_civil)));
//                persona.setNacionalidad(cursor.getString(cursor.getColumnIndex(DB.per_nacionalidad)));
//                persona.setPais(cursor.getString(cursor.getColumnIndex(DB.per_pais)));
//                persona.setFecNac(cursor.getString(cursor.getColumnIndex(DB.per_fecha_nacimiento)));
//                persona.setFecVenc(cursor.getString(cursor.getColumnIndex(DB.per_fecha_venc_doc)));
//                persona.setGradoInstruc(cursor.getString(cursor.getColumnIndex(DB.per_grado_instruccion)));
//                persona.setProfesion(cursor.getString(cursor.getColumnIndex(DB.per_profesion)));
//                persona.setSecEco(cursor.getString(cursor.getColumnIndex(DB.per_sector_economico)));
//                persona.setActEco(cursor.getString(cursor.getColumnIndex(DB.per_actividad_economica)));
//                persona.setConyugue(cursor.getString(cursor.getColumnIndex(DB.per_nombre_conyugue)));
//                persona.setTipoResidente(cursor.getString(cursor.getColumnIndex(DB.per_tipo_residente)));
//                persona.setDepto(cursor.getString(cursor.getColumnIndex(DB.per_departamento)));
//                persona.setCiudad(cursor.getString(cursor.getColumnIndex(DB.per_ciudad)));
//                persona.setZona(cursor.getString(cursor.getColumnIndex(DB.per_zona)));
//                persona.setLugarNac(cursor.getString(cursor.getColumnIndex(DB.per_lugar_nacimiento)));
//                persona.setCiudadData(cursor.getString(cursor.getColumnIndex(DB.per_ext_ciudad)));
//                persona.setEstadoData(cursor.getString(cursor.getColumnIndex(DB.per_ext_estado)));
//                persona.setPaisData(cursor.getString(cursor.getColumnIndex(DB.per_ext_pais)));
//                persona.setLocalidad(cursor.getString(cursor.getColumnIndex(DB.per_localidad)));
//                persona.setBarrioZona(cursor.getString(cursor.getColumnIndex(DB.per_barrio)));
//                persona.setDireccion(cursor.getString(cursor.getColumnIndex(DB.per_direccion)));
//                persona.setNroPuerta(cursor.getString(cursor.getColumnIndex(DB.per_nro_puerta)));
//                persona.setEdifCondo(cursor.getString(cursor.getColumnIndex(DB.per_edificio)));
//                persona.setNroPiso(cursor.getString(cursor.getColumnIndex(DB.per_nro_piso)));
//                persona.setNroDepto(cursor.getString(cursor.getColumnIndex(DB.per_nro_departamento)));
//                persona.setContactEmail(cursor.getString(cursor.getColumnIndex(DB.per_correo_electronico)));
//                persona.setContactCodPais(cursor.getString(cursor.getColumnIndex(DB.per_telf_cod_pais)));
//                persona.setContactTel(cursor.getString(cursor.getColumnIndex(DB.per_telf)));
//                persona.setContactCel(cursor.getString(cursor.getColumnIndex(DB.per_celular)));
//                persona.setContactFax(cursor.getString(cursor.getColumnIndex(DB.per_fax)));
//                persona.setOfiLugar(cursor.getString(cursor.getColumnIndex(DB.per_tra_lugar_trabajo)));
//                persona.setOfiActEco(cursor.getString(cursor.getColumnIndex(DB.per_tra_actividad_economica)));
//                persona.setOfiSecEco(cursor.getString(cursor.getColumnIndex(DB.per_tra_sector_economico)));
//                persona.setOfiCargo(cursor.getString(cursor.getColumnIndex(DB.per_tra_cargo)));
//                persona.setOfiFechaIngreso(cursor.getString(cursor.getColumnIndex(DB.per_tra_fecha_ingreso)));
//                persona.setOfiSitLaboral(cursor.getString(cursor.getColumnIndex(DB.per_tra_situacion_laboral)));
//                persona.setOfiTipoResidente(cursor.getString(cursor.getColumnIndex(DB.per_tra_tipo_residente)));
//                persona.setOfiCiudadResidencia(cursor.getString(cursor.getColumnIndex(DB.per_tra_ciudad_recidencia)));
//                persona.setOfiLocalidad(cursor.getString(cursor.getColumnIndex(DB.per_tra_localidad)));
//                persona.setOfiBarrioZona(cursor.getString(cursor.getColumnIndex(DB.per_tra_zona)));
//                persona.setOfiDireccion(cursor.getString(cursor.getColumnIndex(DB.per_tra_direccion)));
//                persona.setOfiNroPuerta(cursor.getString(cursor.getColumnIndex(DB.per_tra_nro_puerta)));
//                persona.setOfiEdifCondo(cursor.getString(cursor.getColumnIndex(DB.per_tra_edificio)));
//                persona.setOfiNroPiso(cursor.getString(cursor.getColumnIndex(DB.per_tra_nro_piso)));
//                persona.setOfiNroDepto(cursor.getString(cursor.getColumnIndex(DB.per_tra_nro_departamento)));
//                persona.setOfiTel1(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_1)));
//                persona.setOfiTel2(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_2)));
//                persona.setOfiTel3(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_3)));
//                persona.setOfiTel4(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_4)));
//                persona.setOfiFax(cursor.getString(cursor.getColumnIndex(DB.per_tra_fax)));
//                persona.setOfiCasilla(cursor.getString(cursor.getColumnIndex(DB.per_tra_casilla)));
//                persona.setOfiEmail(cursor.getString(cursor.getColumnIndex(DB.per_tra_correo_electronico)));
//                persona.setOfiCelular(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_5)));
//                persona.setIngresosAnuales(cursor.getString(cursor.getColumnIndex(DB.per_tra_ingresos_anuales)));
//                persona.setOrigenFondos(cursor.getString(cursor.getColumnIndex(DB.per_tra_origen_fondos)));
//                persona.setOrigenFondosData(cursor.getString(cursor.getColumnIndex(DB.per_tra_detalle_origen_fondos)));
//                persona.setObs(cursor.getString(cursor.getColumnIndex(DB.per_observaciones)));
//                persona.setFunds(cursor.getString(cursor.getColumnIndex(DB.per_affiliated_funds)));
//
//                persona.setReferencesSoapObject(getDataReferencesFromUser(Util.getPreference(mContext, Prefer.LAST_NRO_DOCUMENTO)));
//
//                personas.add(persona);
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//
//        return personas;
//    }
//
//
//    public Persona getLastPersonRegisteredObj(String nroDocumento) {
//
//        String[] parameters = {"1", nroDocumento};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.per_documento + ", " +
//                DB.per_tipo_documento + ", " +
//                DB.per_expedido_en + ", " +
//                DB.per_nombre + ", " +
//                DB.per_paterno + ", " +
//                DB.per_materno + ", " +
//                DB.per_ap_casada + ", " +
//                DB.per_nit + ", " +
//                DB.per_fecha_nacimiento + ", " +
//                DB.per_fecha_venc_doc + ", " +
//                DB.per_fecha_act_info + ", " +
//                DB.per_sexo + ", " +
//                DB.per_estado_civil + ", " +
//                DB.per_nacionalidad + ", " +
//                DB.per_pais + ", " +
//                DB.per_avatar + ", " +
//                DB.per_signature + ", " +
//                DB.per_grado_instruccion + ", " +
//                DB.per_profesion + ", " +
//                DB.per_sector_economico + ", " +
//                DB.per_actividad_economica + ", " +
//                DB.per_nombre_conyugue + ", " +
//                DB.per_tipo_residente + ", " +
//                DB.per_departamento + ", " +
//                DB.per_ciudad + ", " +
//                DB.per_zona + ", " +
//                DB.per_ext_ciudad + ", " +
//                DB.per_ext_estado + ", " +
//                DB.per_ext_pais + ", " +
//                DB.per_lugar_nacimiento + ", " +
//                DB.per_localidad + ", " +
//                DB.per_barrio + ", " +
//                DB.per_direccion + ", " +
//                DB.per_nro_puerta + ", " +
//                DB.per_edificio + ", " +
//                DB.per_nro_piso + ", " +
//                DB.per_nro_departamento + ", " +
//                DB.per_correo_electronico + ", " +
//                DB.per_telf_cod_pais + ", " +
//                DB.per_telf + ", " +
//                DB.per_celular + ", " +
//                DB.per_fax + ", " +
//                DB.per_tra_actividad_economica + ", " +
//                DB.per_tra_datos_empresa + ", " +
//                DB.per_tra_sector_economico + ", " +
//                DB.per_tra_lugar_trabajo + ", " +
//                DB.per_tra_cargo + ", " +
//                DB.per_tra_fecha_ingreso + ", " +
//                DB.per_tra_situacion_laboral + ", " +
//                DB.per_tra_ingresos_anuales + ", " +
//                DB.per_tra_origen_fondos + ", " +
//                DB.per_tra_detalle_origen_fondos + ", " +
//                DB.per_tra_tipo_residente + ", " +
//                DB.per_tra_ciudad_recidencia + ", " +
//                DB.per_tra_localidad + ", " +
//                DB.per_tra_zona + ", " +
//                DB.per_tra_direccion + ", " +
//                DB.per_tra_nro_puerta + ", " +
//                DB.per_tra_edificio + ", " +
//                DB.per_tra_nro_piso + ", " +
//                DB.per_tra_nro_departamento + ", " +
//                DB.per_tra_telf_1 + ", " +
//                DB.per_tra_telf_2 + ", " +
//                DB.per_tra_telf_3 + ", " +
//                DB.per_tra_telf_4 + ", " +
//                DB.per_tra_telf_5 + ", " +
//                DB.per_tra_fax + ", " +
//                DB.per_tra_casilla + ", " +
//                DB.per_tra_correo_electronico + ", " +
//                DB.per_affiliated_funds + ", " +
//                DB.per_affiliated_funds_names + ", " +
//                DB.per_observaciones + ", " +
//                DB.sync_photo_state + ", " +
//                DB.sync_signature_state + ", " +
//                DB.per_affiliated_funds + ", " +
//                DB.per_state + ", " +
//                DB.per_sync +
//                " FROM " + DB.table_persona +
//                " WHERE " + DB.per_state + "=?" +
//                " AND " + DB.per_documento + "=?";
//
//
//        Log.e("TAG", sql);
//        Persona persona = new Persona();
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//
//                persona.setDoc(cursor.getString(cursor.getColumnIndex(DB.per_documento)));
//                persona.setTipoDoc(cursor.getString(cursor.getColumnIndex(DB.per_tipo_documento)));
//                persona.setDocExpedido(cursor.getString(cursor.getColumnIndex(DB.per_expedido_en)));
//                persona.setNombres(cursor.getString(cursor.getColumnIndex(DB.per_nombre)));
//                persona.setPaterno(cursor.getString(cursor.getColumnIndex(DB.per_paterno)));
//                persona.setMaterno(cursor.getString(cursor.getColumnIndex(DB.per_materno)));
//                persona.setApeCasada(cursor.getString(cursor.getColumnIndex(DB.per_ap_casada)));
//                persona.setNit(cursor.getString(cursor.getColumnIndex(DB.per_nit)));
//                persona.setSexo(cursor.getString(cursor.getColumnIndex(DB.per_sexo)));
//                persona.setEstadoCivil(cursor.getString(cursor.getColumnIndex(DB.per_estado_civil)));
//                persona.setNacionalidad(cursor.getString(cursor.getColumnIndex(DB.per_nacionalidad)));
//                persona.setPais(cursor.getString(cursor.getColumnIndex(DB.per_pais)));
//                persona.setFecNac(cursor.getString(cursor.getColumnIndex(DB.per_fecha_nacimiento)));
//                persona.setFecVenc(cursor.getString(cursor.getColumnIndex(DB.per_fecha_venc_doc)));
//                persona.setGradoInstruc(cursor.getString(cursor.getColumnIndex(DB.per_grado_instruccion)));
//                persona.setProfesion(cursor.getString(cursor.getColumnIndex(DB.per_profesion)));
//                persona.setSecEco(cursor.getString(cursor.getColumnIndex(DB.per_sector_economico)));
//                persona.setActEco(cursor.getString(cursor.getColumnIndex(DB.per_actividad_economica)));
//                persona.setConyugue(cursor.getString(cursor.getColumnIndex(DB.per_nombre_conyugue)));
//                persona.setTipoResidente(cursor.getString(cursor.getColumnIndex(DB.per_tipo_residente)));
//                persona.setDepto(cursor.getString(cursor.getColumnIndex(DB.per_departamento)));
//                persona.setCiudad(cursor.getString(cursor.getColumnIndex(DB.per_ciudad)));
//                persona.setZona(cursor.getString(cursor.getColumnIndex(DB.per_zona)));
//                persona.setLugarNac(cursor.getString(cursor.getColumnIndex(DB.per_lugar_nacimiento)));
//                persona.setCiudadData(cursor.getString(cursor.getColumnIndex(DB.per_ext_ciudad)));
//                persona.setEstadoData(cursor.getString(cursor.getColumnIndex(DB.per_ext_estado)));
//                persona.setPaisData(cursor.getString(cursor.getColumnIndex(DB.per_ext_pais)));
//                persona.setLocalidad(cursor.getString(cursor.getColumnIndex(DB.per_localidad)));
//                persona.setBarrioZona(cursor.getString(cursor.getColumnIndex(DB.per_barrio)));
//                persona.setDireccion(cursor.getString(cursor.getColumnIndex(DB.per_direccion)));
//                persona.setNroPuerta(cursor.getString(cursor.getColumnIndex(DB.per_nro_puerta)));
//                persona.setEdifCondo(cursor.getString(cursor.getColumnIndex(DB.per_edificio)));
//                persona.setNroPiso(cursor.getString(cursor.getColumnIndex(DB.per_nro_piso)));
//                persona.setNroDepto(cursor.getString(cursor.getColumnIndex(DB.per_nro_departamento)));
//                persona.setContactEmail(cursor.getString(cursor.getColumnIndex(DB.per_correo_electronico)));
//                persona.setContactCodPais(cursor.getString(cursor.getColumnIndex(DB.per_telf_cod_pais)));
//                persona.setContactTel(cursor.getString(cursor.getColumnIndex(DB.per_telf)));
//                persona.setContactCel(cursor.getString(cursor.getColumnIndex(DB.per_celular)));
//                persona.setContactFax(cursor.getString(cursor.getColumnIndex(DB.per_fax)));
//                persona.setOfiLugar(cursor.getString(cursor.getColumnIndex(DB.per_tra_lugar_trabajo)));
//                persona.setOfiActEco(cursor.getString(cursor.getColumnIndex(DB.per_tra_actividad_economica)));
//                persona.setOfiSecEco(cursor.getString(cursor.getColumnIndex(DB.per_tra_sector_economico)));
//                persona.setOfiCargo(cursor.getString(cursor.getColumnIndex(DB.per_tra_cargo)));
//                persona.setOfiFechaIngreso(cursor.getString(cursor.getColumnIndex(DB.per_tra_fecha_ingreso)));
//                persona.setOfiSitLaboral(cursor.getString(cursor.getColumnIndex(DB.per_tra_situacion_laboral)));
//                persona.setOfiTipoResidente(cursor.getString(cursor.getColumnIndex(DB.per_tra_tipo_residente)));
//                persona.setOfiCiudadResidencia(cursor.getString(cursor.getColumnIndex(DB.per_tra_ciudad_recidencia)));
//                persona.setOfiLocalidad(cursor.getString(cursor.getColumnIndex(DB.per_tra_localidad)));
//                persona.setOfiBarrioZona(cursor.getString(cursor.getColumnIndex(DB.per_tra_zona)));
//                persona.setOfiDireccion(cursor.getString(cursor.getColumnIndex(DB.per_tra_direccion)));
//                persona.setOfiNroPuerta(cursor.getString(cursor.getColumnIndex(DB.per_tra_nro_puerta)));
//                persona.setOfiEdifCondo(cursor.getString(cursor.getColumnIndex(DB.per_tra_edificio)));
//                persona.setOfiNroPiso(cursor.getString(cursor.getColumnIndex(DB.per_tra_nro_piso)));
//                persona.setOfiNroDepto(cursor.getString(cursor.getColumnIndex(DB.per_tra_nro_departamento)));
//                persona.setOfiTel1(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_1)));
//                persona.setOfiTel2(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_2)));
//                persona.setOfiTel3(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_3)));
//                persona.setOfiTel4(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_4)));
//                persona.setOfiFax(cursor.getString(cursor.getColumnIndex(DB.per_tra_fax)));
//                persona.setOfiCasilla(cursor.getString(cursor.getColumnIndex(DB.per_tra_casilla)));
//                persona.setOfiEmail(cursor.getString(cursor.getColumnIndex(DB.per_tra_correo_electronico)));
//                persona.setOfiCelular(cursor.getString(cursor.getColumnIndex(DB.per_tra_telf_5)));
//                persona.setIngresosAnuales(cursor.getString(cursor.getColumnIndex(DB.per_tra_ingresos_anuales)));
//                persona.setOrigenFondos(cursor.getString(cursor.getColumnIndex(DB.per_tra_origen_fondos)));
//                persona.setOrigenFondosData(cursor.getString(cursor.getColumnIndex(DB.per_tra_detalle_origen_fondos)));
//                persona.setObs(cursor.getString(cursor.getColumnIndex(DB.per_observaciones)));
//                persona.setFunds(cursor.getString(cursor.getColumnIndex(DB.per_affiliated_funds)));
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return persona;
//    }
//
//
//
//    public ArrayList<Cuenta> getNoSyncCuenta() {
//
//        ArrayList<Cuenta> ws_cuentas = new ArrayList<>();
//        Cuenta ws_cuenta = new Cuenta();
//        String[] parameters = {"1"};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.cuenta_fondo + ", " +
//                DB.cuenta_per_documento + ", " +
//                DB.cuenta_nombre_cuenta + ", " +
//                DB.cuenta_nit + ", " +
//                DB.cuenta_nombre + ", " +
//                DB.cuenta_lugar_envio_correspondencia + ", " +
//                DB.cuenta_ciudad + ", " +
//                DB.cuenta_zona + ", " +
//                DB.cuenta_barrio + ", " +
//                DB.cuenta_actividad_economica + ", " +
//                DB.cuenta_como_se_entero + ", " +
//                DB.cuenta_affiliated_funds + ", " +
//                DB.cuenta_sync +
//
//                " FROM " + DB.table_cuenta +
//                " WHERE " + DB.cuenta_sync + "!=?";
//
//        Log.e("TAG", sql);
//
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//
//                ws_cuenta.setCodCli(cursor.getString(cursor.getColumnIndex(DB.cuenta_per_documento)));
//                ws_cuenta.setActEco(cursor.getString(cursor.getColumnIndex(DB.cuenta_actividad_economica)));
//                ws_cuenta.setComoEntero(cursor.getString(cursor.getColumnIndex(DB.cuenta_como_se_entero)));
//                ws_cuenta.setNombre(cursor.getString(cursor.getColumnIndex(DB.cuenta_nombre_cuenta)));
//                ws_cuenta.setNombreFacturar(cursor.getString(cursor.getColumnIndex(DB.cuenta_nombre)));
//                ws_cuenta.setRucFacturar(cursor.getString(cursor.getColumnIndex(DB.cuenta_nit)));
//                ws_cuenta.setLugEnvioCorres(cursor.getString(cursor.getColumnIndex(DB.cuenta_lugar_envio_correspondencia)));
//                ws_cuenta.setCiudadCorres(cursor.getString(cursor.getColumnIndex(DB.cuenta_ciudad)));
//                ws_cuenta.setZonaCorres(cursor.getString(cursor.getColumnIndex(DB.cuenta_zona)));
//                ws_cuenta.setAffiliatedFunds(cursor.getString(cursor.getColumnIndex(DB.cuenta_affiliated_funds)));
//
//                ws_cuentas.add(ws_cuenta);
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return ws_cuentas;
//    }
//
//    public ArrayList<Persona> getAllPersonas() {
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        String sql = "SELECT " +
//                DB.per_documento + ", " + //0
//                DB.per_tipo_documento + ", " + //1
//                DB.per_expedido_en + ", " + //2
//                DB.per_nombre + ", " + //3
//                DB.per_paterno + ", " + //4
//                DB.per_materno + ", " + //5
//                DB.per_ap_casada + ", " + //6
//                DB.per_nit + ", " + //7
//                DB.per_fecha_nacimiento + ", " + //8
//                DB.per_fecha_venc_doc + ", " + //9
//                DB.per_fecha_act_info + ", " + //10
//                DB.per_sexo + ", " + //11
//                DB.per_estado_civil + ", " + //12
//                DB.per_nacionalidad + ", " + //13
//                DB.per_pais + ", " + //14
//                DB.per_avatar + ", " + //15
//                DB.per_signature + ", " + //16
//                DB.per_grado_instruccion + ", " + //17
//                DB.per_profesion + ", " + //18
//                DB.per_sector_economico + ", " + //19
//                DB.per_actividad_economica + ", " + //20
//                DB.per_nombre_conyugue + ", " + //21
//
//                DB.per_avateres_route + ", " + //22
//
//                DB.per_ciudad + ", " + //23
//                DB.per_tra_ciudad_recidencia + ", " + //24
//                DB.per_tra_origen_fondos + ", " + //25
//
//                DB.per_affiliated_funds + ", " + //26
//                DB.per_affiliated_funds_names + ", " + //27
//
//                DB.per_resp_json + ", " + //28
//
//                DB.per_fecha_creacion_registro + ", " + //29
//
//                DB.per_state + ", " + //31
//                DB.sync_photo_state + ", " + //32
//                DB.sync_signature_state + ", " + //33
//
//                DB.per_sync + //34
//                " FROM " + DB.table_persona +
//                " WHERE " + DB.per_state + "=1" +
//                " ORDER BY " + DB.per_code + " DESC";
//
//        Log.e("TAG", sql);
//        Cursor cursor = mDb.rawQuery(sql, null);
//        ArrayList<Persona> personaArrayList = new ArrayList<>();
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//
//                Persona personas = new Persona();
//
//                personas.setDoc(cursor.getString(cursor.getColumnIndex(DB.per_documento)));
//                personas.setDocExpedido(cursor.getString(cursor.getColumnIndex(DB.per_expedido_en)));
//                personas.setNombres(cursor.getString(cursor.getColumnIndex(DB.per_nombre)));
//                personas.setPaterno(cursor.getString(cursor.getColumnIndex(DB.per_paterno)));
//                personas.setMaterno(cursor.getString(cursor.getColumnIndex(DB.per_materno)));
//                personas.setApeCasada(cursor.getString(cursor.getColumnIndex(DB.per_ap_casada)));
//                personas.setNit(cursor.getString(cursor.getColumnIndex(DB.per_nit)));
//                personas.setFecNac(cursor.getString(cursor.getColumnIndex(DB.per_fecha_nacimiento)));
//                personas.setFecVenc(cursor.getString(cursor.getColumnIndex(DB.per_fecha_venc_doc)));
//                personas.setFecVenc(cursor.getString(cursor.getColumnIndex(DB.per_fecha_venc_doc)));
//                personas.setSexo(cursor.getString(cursor.getColumnIndex(DB.per_sexo)));
//                personas.setEstadoCivil(cursor.getString(cursor.getColumnIndex(DB.per_estado_civil)));
//                personas.setNacionalidad(cursor.getString(cursor.getColumnIndex(DB.per_nacionalidad)));
//                personas.setPais(cursor.getString(cursor.getColumnIndex(DB.per_pais)));
//
//                personas.setAvatarRoute(cursor.getString(cursor.getColumnIndex(DB.per_avateres_route)));
//
//                personas.setPer_avatar(cursor.getBlob(cursor.getColumnIndex(DB.per_avatar)));
//                personas.setPer_signature(cursor.getBlob(cursor.getColumnIndex(DB.per_signature)));
//
//                personas.setGradoInstruc(cursor.getString(cursor.getColumnIndex(DB.per_grado_instruccion)));
//                personas.setProfesion(cursor.getString(cursor.getColumnIndex(DB.per_profesion)));
//                personas.setSecEco(cursor.getString(cursor.getColumnIndex(DB.per_sector_economico)));
//                personas.setActEco(cursor.getString(cursor.getColumnIndex(DB.per_actividad_economica)));
//                personas.setConyugue(cursor.getString(cursor.getColumnIndex(DB.per_nombre_conyugue)));
//
//                personas.setCiudad(cursor.getString(cursor.getColumnIndex(DB.per_ciudad)));
//                personas.setOfiCiudadResidencia(cursor.getString(cursor.getColumnIndex(DB.per_tra_ciudad_recidencia)));
//                personas.setOrigenFondos(cursor.getString(cursor.getColumnIndex(DB.per_tra_origen_fondos)));
//                personas.setPer_registered_funds(cursor.getString(cursor.getColumnIndex(DB.per_affiliated_funds)));
//                personas.setPer_registered_funds_names(cursor.getString(cursor.getColumnIndex(DB.per_affiliated_funds_names)));
//                personas.setPer_resp_json(cursor.getString(cursor.getColumnIndex(DB.per_resp_json)));
//
//                personas.setFechaCreacionRegistro(cursor.getString(cursor.getColumnIndex(DB.per_fecha_creacion_registro)));
//
//                personas.setPer_state(cursor.getString(cursor.getColumnIndex(DB.per_state)));
//
//                personas.setPer_sync_photo_state(cursor.getString(cursor.getColumnIndex(DB.sync_photo_state)));
//                personas.setPer_sync_signature_state(cursor.getString(cursor.getColumnIndex(DB.sync_signature_state)));
//
//                personas.setPer_sync(cursor.getString(cursor.getColumnIndex(DB.per_sync)));
//
//                personaArrayList.add(personas);
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return personaArrayList;
//    }
//
////    CUENTAS =============================================
//
//    public ArrayList<Cuenta> getDataCuentas() {
//        Log.e("TAG", " ESNTA AL GET DOCUMENTO");
////        String[] parameters = {nroDocumento};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.cuenta_fondo + ", " +
//                DB.cuenta_per_documento + ", " +
//                DB.cuenta_nombre_cuenta + ", " +
//                DB.cuenta_nit + ", " +
//                DB.cuenta_nombre + ", " +
//                DB.cuenta_lugar_envio_correspondencia + ", " +
//                DB.cuenta_ciudad + ", " +
//                DB.cuenta_zona + ", " +
//                DB.cuenta_barrio + ", " +
//                DB.cuenta_actividad_economica + ", " +
//                DB.cuenta_como_se_entero + ", " +
//                DB.cuenta_sync +
//
//                " FROM " + DB.table_cuenta +
//                " ORDER BY " + DB.cuenta_id_cuenta + " DESC";
////                " WHERE " + DB.ref_per_documento + "=?";
//
//        Log.e("TAG", sql);
//        Cursor cursor = mDb.rawQuery(sql, null);
//        ArrayList<Cuenta> cuentasArrayList = new ArrayList<>();
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//
//                Cuenta cuenta = new Cuenta();
//
//                cuenta.setCodCli(cursor.getString(cursor.getColumnIndex(DB.cuenta_per_documento)));
//                cuenta.setActEco(cursor.getString(cursor.getColumnIndex(DB.cuenta_actividad_economica)));
//                cuenta.setComoEntero(cursor.getString(cursor.getColumnIndex(DB.cuenta_como_se_entero)));
//                cuenta.setNombre(cursor.getString(cursor.getColumnIndex(DB.cuenta_nombre_cuenta)));
//                cuenta.setNombreFacturar(cursor.getString(cursor.getColumnIndex(DB.cuenta_nombre)));
//                cuenta.setRucFacturar(cursor.getString(cursor.getColumnIndex(DB.cuenta_nit)));
//                cuenta.setLugEnvioCorres(cursor.getString(cursor.getColumnIndex(DB.cuenta_lugar_envio_correspondencia)));
//                cuenta.setCiudadCorres(cursor.getString(cursor.getColumnIndex(DB.cuenta_ciudad)));
//                cuenta.setZonaCorres(cursor.getString(cursor.getColumnIndex(DB.cuenta_zona)));
//                cuenta.setAffiliatedFunds(cursor.getString(cursor.getColumnIndex(DB.cuenta_fondo)));
//                cuenta.setSyncState(cursor.getString(cursor.getColumnIndex(DB.cuenta_sync)));
//
//                cuentasArrayList.add(cuenta);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return cuentasArrayList;
//    }
//
//    public boolean updateSyncState(String nroDocumento, String state) {
//        Log.e("NRO_DOC>", nroDocumento);
//        Log.e("STATE>", state);
//
//        String[] selection = new String[]{nroDocumento};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(DB.per_sync, state);
//
//        boolean result = mDb.update(DB.table_persona, contentValues,
//                DB.per_documento + " =?  "
//                , selection) > 0;
//        mDb.close();
//        Log.e("RESULT>", ""+result);
//        return result;
//    }
//
//    public boolean updateSyncStateCuentas(String nroDocumento, String state) {
//        String[] selection = new String[]{nroDocumento};
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(DB.cuenta_sync, state);
//
//        boolean result = mDb.update(DB.table_cuenta, contentValues,
//                DB.cuenta_per_documento + " =?  "
//                , selection) > 0;
//        mDb.close();
//        L.e(this, result + " ...Result DIRECCION FRAGMENT.............................");
//        mDb.close();
//        return result;
//    }
//
//
////   REFERENCIA ===================================================================
//
//    public ArrayList<Referencia> getDataReferences(String nroDocumento) {
//        Log.e("TAG", " ESNTA AL GET DOCUMENTO");
//        String[] parameters = {nroDocumento};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.ref_code + ", " + //0
//                DB.ref_per_documento + ", " + //1
//                DB.ref_tipo + ", " + //2
//                DB.ref_fecha_referencia + ", " + //3
//                DB.ref_institucion + ", " + //4
//                DB.ref_cuenta + ", " + //5
//                DB.ref_contacto + ", " + //6
//                DB.ref_nro_contacto + ", " + //7
//                DB.ref_ciudad + ", " + //8
//                DB.ref_pais + ", " + //9
//                DB.ref_celular + //10
//                " FROM " + DB.table_reference +
//                " WHERE " + DB.ref_per_documento + "=?";
//
//        Log.e("TAG", sql);
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        ArrayList<Referencia> referencesArrayList = new ArrayList<>();
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//
//                Referencia referencia = new Referencia();
//                referencia.setRefCode(cursor.getString(cursor.getColumnIndex(DB.ref_code)));
//                referencia.setRefPerDocumento(cursor.getString(cursor.getColumnIndex(DB.ref_per_documento)));
//                referencia.setTipo(cursor.getString(cursor.getColumnIndex(DB.ref_tipo)));
//                referencia.setInstitucion(cursor.getString(cursor.getColumnIndex(DB.ref_institucion)));
//                referencia.setCuenta(cursor.getString(cursor.getColumnIndex(DB.ref_cuenta)));
//                referencia.setContacto(cursor.getString(cursor.getColumnIndex(DB.ref_contacto)));
//                referencia.setNroContactoTelefono(cursor.getString(cursor.getColumnIndex(DB.ref_nro_contacto)));
//                referencia.setNroContactoCelular(cursor.getString(cursor.getColumnIndex(DB.ref_celular)));
//                referencia.setCiudad(cursor.getString(cursor.getColumnIndex(DB.ref_ciudad)));
//                referencia.setPais(cursor.getString(cursor.getColumnIndex(DB.ref_pais)));
//
//                referencesArrayList.add(referencia);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return referencesArrayList;
//    }
//
//    public ArrayList<Referencia> getDataReferencesFromUser(String nroDocumento) {
//        Log.e("TAG", " ESNTA AL GET DOCUMENTO");
//        String[] parameters = {nroDocumento};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.ref_code + ", " + //0
//                DB.ref_per_documento + ", " + //1
//                DB.ref_tipo + ", " + //2
//                DB.ref_fecha_referencia + ", " + //3
//                DB.ref_institucion + ", " + //4
//                DB.ref_cuenta + ", " + //5
//                DB.ref_contacto + ", " + //6
//                DB.ref_nro_contacto + ", " + //7
//                DB.ref_ciudad + ", " + //8
//                DB.ref_pais + ", " + //9
//                DB.ref_celular + //10
//                " FROM " + DB.table_reference +
//                " WHERE " + DB.ref_per_documento + "=?";
//
//        Log.e("TAG", sql);
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        ArrayList<Referencia> referencesArrayList = new ArrayList<>();
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//
//                Referencia ws_referencia = new Referencia();
//                ws_referencia.setTipo(cursor.getString(2));
//                ws_referencia.setInstitucion(cursor.getString(4));
//                ws_referencia.setCuenta(cursor.getString(5));
//                ws_referencia.setContacto(cursor.getString(6));
//                ws_referencia.setNroContactoTelefono(cursor.getString(7));
//                ws_referencia.setNroContactoCelular(cursor.getString(10));
//                ws_referencia.setCiudad(cursor.getString(8));
//                ws_referencia.setPais(cursor.getString(9));
//
//
//                referencesArrayList.add(ws_referencia);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return referencesArrayList;
//    }
//
//    public String getCodeFromFund(String nameFund) {
//        String code = "";
//        String[] parameters = {nameFund};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.funds_code + //0
//                " FROM " + DB.table_funds +
//                " WHERE " + DB.funds_name + "=?";
//
//        Log.e("TAG", sql);
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//                code = cursor.getString(0);
//
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return code;
//    }
//
//    public boolean uploadImageSyncState(String nroDocumento, String type) {
//        String[] selection = new String[]{nroDocumento};
//
//        L.e(this, "upload_tipo>" + type);
//        L.e(this, "upload_documento>" + nroDocumento);
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        ContentValues contentValues = new ContentValues();
//        if (type.equals("FIR")) {
//            contentValues.put(DB.sync_signature_state, "1");
//        } else if (type.equals("FOT")) {
//            contentValues.put(DB.sync_photo_state, "1");
//        }
//
//        boolean result = mDb.update(DB.table_persona, contentValues,
//                DB.per_documento + " =?"
//                , selection) > 0;
//        mDb.close();
//        Log.e("upload_result>", "" + result);
//        mDb.close();
//        return result;
//    }
//
//
//    public void savePersona() {
//        Log.e("TAG>", "ENTRA AL SAVE PERSONA..........");
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        ContentValues contentValues = new ContentValues();
//
//        contentValues.put(DB.per_documento, Util.getPreference(mContext, Prefer.PER_DOCUMENTO));
//        contentValues.put(DB.per_tipo_documento, Util.getPreference(mContext, Prefer.PER_TIPO_DOCUMENTO));
//        contentValues.put(DB.per_expedido_en, Util.getPreference(mContext, Prefer.PER_EXPEDIDO_EN));
//        contentValues.put(DB.per_nombre, Util.getPreference(mContext, Prefer.PER_NOMBRE));
//        contentValues.put(DB.per_paterno, Util.getPreference(mContext, Prefer.PER_PATERNO));
//
//        contentValues.put(DB.per_materno, Util.getPreference(mContext, Prefer.PER_MATERNO));
//        contentValues.put(DB.per_ap_casada, Util.getPreference(mContext, Prefer.PER_AP_CASADA));
//        contentValues.put(DB.per_nit, Util.getPreference(mContext, Prefer.PER_NIT));
//        contentValues.put(DB.per_fecha_nacimiento, Util.getPreference(mContext, Prefer.PER_FECHA_NACIMIENTO));
//        contentValues.put(DB.per_fecha_venc_doc, Util.getPreference(mContext, Prefer.PER_FECHA_VENC_DOC));
//
//        contentValues.put(DB.per_fecha_act_info, Util.getPreference(mContext, Prefer.PER_FECHA_ACT_INFO));
//        contentValues.put(DB.per_sexo, Util.getPreference(mContext, Prefer.PER_SEXO));
//        contentValues.put(DB.per_estado_civil, Util.getPreference(mContext, Prefer.PER_ESTADO_CIVIL));
//        contentValues.put(DB.per_nacionalidad, Util.getPreference(mContext, Prefer.PER_NACIONALIDAD));
//        contentValues.put(DB.per_pais, Util.getPreference(mContext, Prefer.PER_PAIS));
//
//        contentValues.put(DB.per_avateres_route, Util.getPreference(mContext, Prefer.PER_AVATAR_IMAGE_PATH));
//
//
//        if (Util.decodeBase64(Util.getImageBitmap(mContext, Prefer.PER_AVATAR_IMAGE)) != null) {
//            if (Util.getBytes(Util.decodeBase64(Util.getImageBitmap(mContext, Prefer.PER_AVATAR_IMAGE))) != null &&
//                    Util.getBytes(Util.decodeBase64(Util.getImageBitmap(mContext, Prefer.PER_AVATAR_IMAGE))).length > 1) {
//                contentValues.put(DB.per_avatar, Util.getBytes(Util.decodeBase64(Util.getImageBitmap(mContext, Prefer.PER_AVATAR_IMAGE))));
//            } else {
//                contentValues.put(DB.per_avatar, "");
//            }
//        } else {
//            contentValues.put(DB.per_avatar, "");
//        }
//
//
//        if (Util.decodeBase64(Util.getImageBitmap(mContext, Prefer.PER_SIGNATURE_IMAGE)) != null) {
//            if (Util.getBytes(Util.decodeBase64(Util.getImageBitmap(mContext, Prefer.PER_SIGNATURE_IMAGE))) != null &&
//                    Util.getBytes(Util.decodeBase64(Util.getImageBitmap(mContext, Prefer.PER_SIGNATURE_IMAGE))).length > 1) {
//                contentValues.put(DB.per_signature, Util.getBytes(Util.decodeBase64(Util.getImageBitmap(mContext, Prefer.PER_SIGNATURE_IMAGE))));
//            } else {
//                contentValues.put(DB.per_signature, "");
//            }
//        } else {
//            contentValues.put(DB.per_signature, "");
//        }
//
//
//        contentValues.put(DB.per_grado_instruccion, Util.getPreference(mContext, Prefer.PER_GRADO_INSTRUCCION));
//        contentValues.put(DB.per_profesion, Util.getPreference(mContext, Prefer.PER_PROFESION));
//        contentValues.put(DB.per_sector_economico, Util.getPreference(mContext, Prefer.PER_SECTOR_ECONOMICO));
//
//        contentValues.put(DB.per_actividad_economica, Util.getPreference(mContext, Prefer.PER_ACTIVIDAD_ECONOMICA));
//        contentValues.put(DB.per_nombre_conyugue, Util.getPreference(mContext, Prefer.PER_NOMBRE_CONYUGUE));
//        contentValues.put(DB.per_tipo_residente, Util.getPreference(mContext, Prefer.PER_TIPO_RESIDENTE));
//        contentValues.put(DB.per_departamento, Util.getPreference(mContext, Prefer.PER_DEPARTAMENTO));
//        contentValues.put(DB.per_ciudad, Util.getPreference(mContext, Prefer.PER_CIUDAD));
//
//        contentValues.put(DB.per_zona, Util.getPreference(mContext, Prefer.PER_ZONA));
//        contentValues.put(DB.per_ext_ciudad, Util.getPreference(mContext, Prefer.PER_EXT_CIUDAD));
//        contentValues.put(DB.per_ext_estado, Util.getPreference(mContext, Prefer.PER_EXT_ESTADO));
//        contentValues.put(DB.per_ext_pais, Util.getPreference(mContext, Prefer.PER_EXT_PAIS));
//        contentValues.put(DB.per_lugar_nacimiento, Util.getPreference(mContext, Prefer.PER_LUGAR_NACIMIENTO));
//
//        contentValues.put(DB.per_localidad, Util.getPreference(mContext, Prefer.PER_LOCALIDAD));
//        contentValues.put(DB.per_barrio, Util.getPreference(mContext, Prefer.PER_BARRIO));
//        contentValues.put(DB.per_direccion, Util.getPreference(mContext, Prefer.PER_DIRECCION));
//        contentValues.put(DB.per_nro_puerta, Util.getPreference(mContext, Prefer.PER_NRO_PUERTA));
//        contentValues.put(DB.per_edificio, Util.getPreference(mContext, Prefer.PER_EDIFICIO));
//
//        contentValues.put(DB.per_nro_piso, Util.getPreference(mContext, Prefer.PER_NRO_PISO));
//        contentValues.put(DB.per_nro_departamento, Util.getPreference(mContext, Prefer.PER_NRO_DEPARTAMENTO));
//        contentValues.put(DB.per_correo_electronico, Util.getPreference(mContext, Prefer.PER_CORREO_ELECTRONICO));
//        contentValues.put(DB.per_telf_cod_pais, Util.getPreference(mContext, Prefer.PER_TELF_COD_PAIS));
//        contentValues.put(DB.per_telf, Util.getPreference(mContext, Prefer.PER_TELF));
//
//        contentValues.put(DB.per_celular, Util.getPreference(mContext, Prefer.PER_CELULAR));
//        contentValues.put(DB.per_fax, Util.getPreference(mContext, Prefer.PER_FAX));
//        contentValues.put(DB.per_tra_actividad_economica, Util.getPreference(mContext, Prefer.PER_ACTIVIDAD_ECONOMICA));
//        contentValues.put(DB.per_tra_datos_empresa, Util.getPreference(mContext, Prefer.PER_TRA_DATOS_EMPRESA));
//        contentValues.put(DB.per_tra_sector_economico, Util.getPreference(mContext, Prefer.PER_TRA_SECTOR_ECONOMICO));
//
//        contentValues.put(DB.per_tra_lugar_trabajo, Util.getPreference(mContext, Prefer.PER_TRA_LUGAR_TRABAJO));
//        contentValues.put(DB.per_tra_cargo, Util.getPreference(mContext, Prefer.PER_TRA_CARGO));
//        contentValues.put(DB.per_tra_fecha_ingreso, Util.getPreference(mContext, Prefer.PER_TRA_FECHA_INGRESO));
//        contentValues.put(DB.per_tra_situacion_laboral, Util.getPreference(mContext, Prefer.PER_TRA_SITUACION_LABORAL));
//        contentValues.put(DB.per_tra_ingresos_anuales, Util.getPreference(mContext, Prefer.PER_TRA_INGRESOS_ANUALES));
//
//        contentValues.put(DB.per_tra_origen_fondos, Util.getPreference(mContext, Prefer.PER_TRA_ORIGEN_FONDOS));
//        contentValues.put(DB.per_tra_detalle_origen_fondos, Util.getPreference(mContext, Prefer.PER_TRA_DETALLE_ORIGEN_FONDOS));
//        contentValues.put(DB.per_tra_tipo_residente, Util.getPreference(mContext, Prefer.PER_TRA_TIPO_RESIDENTE));
//        contentValues.put(DB.per_tra_ciudad_recidencia, Util.getPreference(mContext, Prefer.PER_TRA_CIUDAD_RECIDENCIA));
//        contentValues.put(DB.per_tra_localidad, Util.getPreference(mContext, Prefer.PER_TRA_LOCALIDAD));
//
//        contentValues.put(DB.per_tra_zona, Util.getPreference(mContext, Prefer.PER_TRA_ZONA));
//        contentValues.put(DB.per_tra_direccion, Util.getPreference(mContext, Prefer.PER_TRA_DIRECCION));
//        contentValues.put(DB.per_tra_nro_puerta, Util.getPreference(mContext, Prefer.PER_TRA_NRO_PUERTA));
//        contentValues.put(DB.per_tra_edificio, Util.getPreference(mContext, Prefer.PER_TRA_EDIFICIO));
//        contentValues.put(DB.per_tra_nro_piso, Util.getPreference(mContext, Prefer.PER_TRA_NRO_PISO));
//
//        contentValues.put(DB.per_tra_nro_departamento, Util.getPreference(mContext, Prefer.PER_TRA_NRO_DEPARTAMENTO));
//        contentValues.put(DB.per_tra_telf_1, Util.getPreference(mContext, Prefer.PER_TRA_TELF_1));
//        contentValues.put(DB.per_tra_telf_2, Util.getPreference(mContext, Prefer.PER_TRA_TELF_2));
//        contentValues.put(DB.per_tra_telf_3, Util.getPreference(mContext, Prefer.PER_TRA_TELF_3));
//        contentValues.put(DB.per_tra_telf_4, Util.getPreference(mContext, Prefer.PER_TRA_TELF_4));
//
//        contentValues.put(DB.per_tra_telf_5, Util.getPreference(mContext, Prefer.PER_TRA_TELF_5));
//        contentValues.put(DB.per_tra_fax, Util.getPreference(mContext, Prefer.PER_TRA_FAX));
//        contentValues.put(DB.per_tra_casilla, Util.getPreference(mContext, Prefer.PER_TRA_CASILLA));
//        contentValues.put(DB.per_tra_correo_electronico, Util.getPreference(mContext, Prefer.PER_TRA_CORREO_ELECTRONICO));
//        contentValues.put(DB.per_affiliated_funds, Util.getPreference(mContext, Prefer.PER_AFFILIATED_FUNDS));
//
//        contentValues.put(DB.per_observaciones, Util.getPreference(mContext, Prefer.PER_OBSERVACIONES));
//        contentValues.put(DB.per_fecha_creacion_registro, Format.date(Util.getActualDate()));
//
//        contentValues.put(DB.per_state, "1");
//        contentValues.put(DB.per_sync, "0");
//
//        contentValues.put(DB.sync_signature_state, "0");
//        contentValues.put(DB.sync_photo_state, "0");
//
//
//        mDb.insert(DB.table_persona, null, contentValues);
//        mDb.close();
//        Log.e("TAG>", "SALE AL SAVE PERSONA..........");
//
//    }
//
//    public void saveCuenta() {
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        ContentValues contentValues = new ContentValues();
//
//        contentValues.put(DB.cuenta_fondo, Util.getPreference(mContext, Prefer.CUENTA_FONDO));
//        contentValues.put(DB.cuenta_per_documento, Util.getPreference(mContext, Prefer.CUENTA_PER_DOCUMENTO));
//        contentValues.put(DB.cuenta_nombre_cuenta, Util.getPreference(mContext, Prefer.CUENTA_NOMBRE_CUENTA));
//        contentValues.put(DB.cuenta_nit, Util.getPreference(mContext, Prefer.CUENTA_NIT));
//        contentValues.put(DB.cuenta_nombre, Util.getPreference(mContext, Prefer.CUENTA_NOMBRE));
//        contentValues.put(DB.cuenta_lugar_envio_correspondencia, Util.getPreference(mContext, Prefer.CUENTA_LUGAR_ENVIO_CORRESPONDENCIA));
//        contentValues.put(DB.cuenta_ciudad, Util.getPreference(mContext, Prefer.CUENTA_CIUDAD));
//        contentValues.put(DB.cuenta_zona, Util.getPreference(mContext, Prefer.CUENTA_ZONA));
//        contentValues.put(DB.cuenta_barrio, Util.getPreference(mContext, Prefer.CUENTA_BARRIO));
//        contentValues.put(DB.cuenta_actividad_economica, Util.getPreference(mContext, Prefer.CUENTA_ACTIVIDAD_ECONOMICA));
//        contentValues.put(DB.cuenta_como_se_entero, Util.getPreference(mContext, Prefer.CUENTA_COMO_SE_ENTERO));
//        contentValues.put(DB.cuenta_affiliated_funds, Util.getPreference(mContext, Prefer.CUENTA_AFFILIATED_FUNDS));
//        contentValues.put(DB.cuenta_fecha_creacion_registro, Format.date(Util.getActualDate()));
//        contentValues.put(DB.cuenta_sync, "0");
//
//        mDb.insert(DB.table_cuenta, null, contentValues);
//        mDb.close();
//    }
//
//// ============================ RESP JSON // ============================
//// ============================ RESP JSON // ============================
//// ============================ RESP JSON // ============================
//
//    public void updateJSONResponsePersona(String nroDocumento, String respuesta) {
//        Log.e("TAG_UPDATE_DATA>", nroDocumento + " . " + respuesta);
//        String[] selection = new String[]{nroDocumento};
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(DB.per_resp_json, respuesta);
//
//        boolean result = mDb.update(DB.table_persona, contentValues,
//                DB.per_documento + " =?  "
//                , selection) > 0;
//        Log.e("RESULT_UPDATE>", " " + result);
//        mDb.close();
//    }
//
//    public String getJSONResultFromUser(String nroDocumento) {
//        String json = "";
//        String[] parameters = {nroDocumento};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.per_resp_json + //0
//                " FROM " + DB.table_persona +
//                " WHERE " + DB.per_documento + "=?";
//
//        Log.e("TAG", sql);
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//                json = cursor.getString(cursor.getColumnIndex(DB.per_resp_json));
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return json;
//    }
//
//
//    //    ====================================================================
//    //    ====================================================================
//    //    ====================================================================
//
//    public void updateJSONResponseCuenta(String nroDocumento, String respuesta) {
//        String[] selection = new String[]{nroDocumento};
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(DB.cuenta_resp_json, respuesta);
//
//        boolean result = mDb.update(DB.table_cuenta, contentValues,
//                DB.cuenta_per_documento + " =?  "
//                , selection) > 0;
//        mDb.close();
//    }
//
//    public String getJSONResultFromCuenta(String nroDocumento) {
//        String json = "";
//        String[] parameters = {nroDocumento};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.cuenta_resp_json + //0
//                " FROM " + DB.table_cuenta +
//                " WHERE " + DB.cuenta_per_documento + "=?";
//
//        Log.e("TAG", sql);
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//            do {
//                json = cursor.getString(cursor.getColumnIndex(DB.cuenta_resp_json));
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        return json;
//    }
//
//    public String getImageField(Context context, String fieldName) {
//        String[] parameters = {Util.getPreference(context, Prefer.LAST_NRO_DOCUMENTO)};
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(context), null);
//        String sql = "SELECT " + fieldName + " FROM " + DB.table_persona + " WHERE " + DB.per_documento + "=?";
//
//        byte[] avatar = null;
//
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        if (cursor.moveToFirst()) {
//            do {
//                avatar = cursor.getBlob(cursor.getColumnIndex(fieldName));
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//
//        if (avatar != null) {
//            return Base64.encodeToString(avatar, 0);
//        } else {
//            return "";
//        }
//    }
//
//
//    public String getImageFieldPersona(Context context, String nroDocumento, String fieldName) {
//        String[] parameters = {nroDocumento};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(context), null);
//        String sql = "SELECT " + fieldName +
//                " FROM " + DB.table_persona +
//                " WHERE " + DB.per_documento + "=?";
//
//        byte[] avatar = null;
//
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//        if (cursor.moveToFirst()) {
//            do {
//                avatar = cursor.getBlob(0);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        mDb.close();
//        assert avatar != null;
////        L.e(this, Arrays.toString(avatar));
//
//        return Base64.encodeToString(avatar, 0);
//    }
//
//    public void saveDataReferences() {
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        ContentValues contentValues = new ContentValues();
//
//        contentValues.put(DB.ref_per_documento, Util.getPreference(mContext, Prefer.REF_PER_DOCUMENTO));
//        contentValues.put(DB.ref_tipo, Util.getPreference(mContext, Prefer.REF_TIPO));
//        contentValues.put(DB.ref_fecha_referencia, Format.date(Util.getActualDate()));
//        contentValues.put(DB.ref_institucion, Util.getPreference(mContext, Prefer.REF_INSTITUCION));
//        contentValues.put(DB.ref_cuenta, Util.getPreference(mContext, Prefer.REF_CUENTA));
//        contentValues.put(DB.ref_contacto, Util.getPreference(mContext, Prefer.REF_CONTACTO));
//        contentValues.put(DB.ref_nro_contacto, Util.getPreference(mContext, Prefer.REF_NRO_CONTACTO));
//        contentValues.put(DB.ref_ciudad, Util.getPreference(mContext, Prefer.REF_CIUDAD));
//        contentValues.put(DB.ref_pais, Util.getPreference(mContext, Prefer.REF_PAIS));
//        contentValues.put(DB.ref_celular, Util.getPreference(mContext, Prefer.REF_CELULAR));
//
//        mDb.insert(DB.table_reference, null, contentValues);
//        mDb.close();
//    }
//
//
//    public Referencia getReferencePerId(String idReference) {
//
//        Referencia referencia = new Referencia();
//        Log.e("TAG", " ESNTA AL GET DOCUMENTO");
//        String[] parameters = {idReference};
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        String sql = "SELECT " +
//                DB.ref_code + ", " + //0
//                DB.ref_per_documento + ", " + //1
//                DB.ref_tipo + ", " + //2
//                DB.ref_fecha_referencia + ", " + //3
//                DB.ref_institucion + ", " + //4
//                DB.ref_cuenta + ", " + //5
//                DB.ref_contacto + ", " + //6
//                DB.ref_nro_contacto + ", " + //7
//                DB.ref_ciudad + ", " + //8
//                DB.ref_pais + ", " + //9
//                DB.ref_celular + //10
//                " FROM " + DB.table_reference +
//                " WHERE " + DB.ref_code + "=?";
//
//        Log.e("TAG", sql);
//        Cursor cursor = mDb.rawQuery(sql, parameters);
//
//
//        if (cursor.moveToFirst()) {
//            Log.e("TAG", cursor.getCount() + " ...............");
//
//
//            referencia.setRefCode(cursor.getString(cursor.getColumnIndex(DB.ref_code)));
//            referencia.setRefPerDocumento(cursor.getString(cursor.getColumnIndex(DB.ref_per_documento)));
//            referencia.setTipo(cursor.getString(cursor.getColumnIndex(DB.ref_tipo)));
//            referencia.setInstitucion(cursor.getString(cursor.getColumnIndex(DB.ref_institucion)));
//            referencia.setCuenta(cursor.getString(cursor.getColumnIndex(DB.ref_cuenta)));
//            referencia.setContacto(cursor.getString(cursor.getColumnIndex(DB.ref_contacto)));
//            referencia.setNroContactoTelefono(cursor.getString(cursor.getColumnIndex(DB.ref_nro_contacto)));
//            referencia.setNroContactoCelular(cursor.getString(cursor.getColumnIndex(DB.ref_celular)));
//            referencia.setCiudad(cursor.getString(cursor.getColumnIndex(DB.ref_ciudad)));
//            referencia.setPais(cursor.getString(cursor.getColumnIndex(DB.ref_pais)));
//
//        }
//        cursor.close();
//        mDb.close();
//        return referencia;
//    }
//
//    public boolean updateDataReferences(String refCode, Referencia refs) {
//
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//        ContentValues contentValues = new ContentValues();
//
////        contentValues.put(DB.ref_code, referencia.getRefCode() == null || referencia.getRefCode().equals("") ? "" : referencia.getRefCode());
////        contentValues.put(DB.ref_per_documento, referencia.getRefPerDocumento() == null || referencia.getRefPerDocumento().equals("") ? "" : referencia.getRefPerDocumento());
//        contentValues.put(DB.ref_tipo, refs.getTipo());
//        contentValues.put(DB.ref_institucion, refs.getInstitucion());
//        contentValues.put(DB.ref_cuenta, refs.getCuenta());
//        contentValues.put(DB.ref_contacto, refs.getContacto());
//        contentValues.put(DB.ref_nro_contacto, refs.getNroContactoTelefono());
//        contentValues.put(DB.ref_celular, refs.getNroContactoCelular());
//        contentValues.put(DB.ref_ciudad, refs.getCiudad());
//        contentValues.put(DB.ref_pais, refs.getPais());
//
//        boolean result = mDb.update(DB.table_reference, contentValues,
//                DB.ref_code + " = " + refCode
//                , null) > 0;
//        mDb.close();
//        L.e(this, result + " ...Result DIRECCION FRAGMENT.............................");
//        return result;
//    }
//
//    public void saveReferencia(Referencia referencia) {
//
//        SQLiteDatabase mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//        ContentValues contentValues = new ContentValues();
//
//        contentValues.put(DB.ref_per_documento, Util.getPreference(mContext, Prefer.LAST_NRO_DOCUMENTO));
//        contentValues.put(DB.ref_tipo, referencia.getTipo());
//        contentValues.put(DB.ref_fecha_referencia, Format.date(Util.getActualDate()));
//        contentValues.put(DB.ref_institucion, referencia.getInstitucion());
//        contentValues.put(DB.ref_cuenta, referencia.getCuenta());
//        contentValues.put(DB.ref_contacto, referencia.getContacto());
//        contentValues.put(DB.ref_nro_contacto, referencia.getNroContactoTelefono());
//        contentValues.put(DB.ref_ciudad, referencia.getCiudad());
//        contentValues.put(DB.ref_pais, referencia.getPais());
//        contentValues.put(DB.ref_celular, referencia.getNroContactoCelular());
//
//        long is = mDb.insert(DB.table_reference, null, contentValues);
//
//        Log.e("INSERT>", "" + is);
//        mDb.close();
//    }

}
