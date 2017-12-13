package com.proj.software.seproj;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


import static com.proj.software.seproj.R.*;

public class WeeklyAd2 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_weekly_ad2);

        pdfView = (PDFView)findViewById(id.pdfView);
        //This is a function to read PDF from Assets
        pdfView.fromAsset("Trucchis_12_10_17.pdf").load();

        //This returns PDF from a website (takes longer to load than from assets)
        //new RetrievePDFStream().execute("http://trucchis.com/TEMP/Trucchis_12_10_17");
    }

    /*This class is used to get PDF from website
    class RetrievePDFStream  extends AsyncTask<String,Void,InputStream>
    {
        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try{
                URL url= new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                if(urlConnection.getResponseCode() == 200)
                {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            }
            catch (IOException e)
            {
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute (InputStream inputStream) {
            pdfView.fromStream(inputStream).load();
        }
    }
    */
}
