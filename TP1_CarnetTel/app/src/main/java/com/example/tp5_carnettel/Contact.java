package com.example.tp5_carnettel;

/**
 * Created by cordier on 31/01/2017.
 */
import android.os.Parcel;
import android.os.Parcelable;


public class Contact
{
    private String mNom;
    private String mPrenom;
    private String mNumero;

    public Contact(String pNom, String pPrenom, String pNumero)
    {
        mNom = pNom;
        mPrenom = pPrenom;
        mNumero = pNumero;
    }


    public String getNumero()
    {
        return mNumero;
    }
    public String getPrenom()
    {
        return mPrenom;
    }
    public String getNom()
    {
        return mNom;
    }


    @Override
    public String toString() {
        return mPrenom;
    }
}