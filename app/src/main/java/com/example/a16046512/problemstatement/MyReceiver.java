package com.example.a16046512.problemstatement;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

import static android.content.Context.NOTIFICATION_SERVICE;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new
                    NotificationChannel("default", "Default Channel",
                    NotificationManager.IMPORTANCE_DEFAULT);
            //if importent change to high
//            NotificationManager.IMPORTANCE_HIGH);




            channel.setDescription("This is for default notification");
            notificationManager.createNotificationChannel(channel);
        }




        Intent i = new Intent(context,MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity
                ( context, 123, i,
                        PendingIntent.FLAG_CANCEL_CURRENT);

        // Build notification
        NotificationCompat.Builder builder = new
                NotificationCompat.Builder(context, "default");
        builder.setContentTitle("Know Your Facts!");
        builder.setContentText("Hey! time to know some fact!!");
        builder.setSmallIcon(R.mipmap.smiles);
        builder.setContentIntent(pIntent);
        builder.setAutoCancel(true);

        Notification n = builder.build();
        // An integer good to have, for you to programmatically cancel it
        notificationManager.notify(123, n);


    }
}
