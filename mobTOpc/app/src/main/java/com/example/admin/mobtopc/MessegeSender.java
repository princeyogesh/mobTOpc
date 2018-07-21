package com.example.admin.mobtopc;

import android.os.AsyncTask;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Yogesh Deshpande on 6/14/2018.
 */

public class MessegeSender extends AsyncTask<String, Void, Void> {
    private Socket s;
    public DataOutputStream dos;
    private PrintWriter pw;

    @Override
    protected Void doInBackground(String...voids) {
        String msg =  voids[0];
        try {
            s = new Socket("192.168.43.241", 7000);
            pw = new PrintWriter(s.getOutputStream());
            pw.write(msg);
            pw.flush();
            pw.close();
            s.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }
}
