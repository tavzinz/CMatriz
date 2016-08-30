package com.tavzenterprise.cmatriz;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ricardo on 30/08/2016.
 */
public class Cartao {

    static String[] A;
    static String[] B;
    static String[] C;
    static String[] D;
    static String[] E;
    static String[] F;
    static String[] G;
    static String[] H;

    static private String[] getLetra(char Letra){
        if(Letra=='A') return A;
        if(Letra=='B') return B;
        if(Letra=='C') return C;
        if(Letra=='D') return D;
        if(Letra=='E') return E;
        if(Letra=='F') return F;
        if(Letra=='G') return G;
        if(Letra=='H') return H;
        return null;
    }

    static public char getResultado(String Codigo){
        String[] letraArray = getLetra(Codigo.charAt(0));
        int pos = Character.getNumericValue(Codigo.charAt(1));
        String algarismos = letraArray[pos-1];
        int car = Character.getNumericValue(Codigo.charAt(2));
        return algarismos.charAt(car-1);
    }

    public static final List<String[]> readCsv(Context context) {
        List<String[]> questionList = new ArrayList<String[]>();
        AssetManager assetManager = context.getAssets();

        String CSV_PATH = "data.csv";

        try {
            InputStream csvStream = assetManager.open(CSV_PATH);
            InputStreamReader csvStreamReader = new InputStreamReader(csvStream);
            CSVReader csvReader = new CSVReader(csvStreamReader);   //http://opencsv.sourceforge.net/
            String[] line;

            // throw away the header
            csvReader.readNext();

            /*while ((line = csvReader.readNext()) != null) {
                questionList.add(line);
                Log.i("csvReader", line.toString());
            }*/

            A = csvReader.readNext();
            B = csvReader.readNext();
            C = csvReader.readNext();
            D = csvReader.readNext();
            E = csvReader.readNext();
            F = csvReader.readNext();
            G = csvReader.readNext();
            H = csvReader.readNext();

            Log.i("csvReader", A[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questionList;
    }
}
