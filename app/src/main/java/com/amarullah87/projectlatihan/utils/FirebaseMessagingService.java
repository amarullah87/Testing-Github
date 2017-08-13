package com.amarullah87.projectlatihan.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

import com.amarullah87.projectlatihan.R;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by apandhis on 13/08/17.
 */

public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        showNotification(
                remoteMessage.getData().get("message"),
                remoteMessage.getData().get("image")
        );
    }

    private void showNotification(String message, String image) {
        Bitmap icon = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        Uri notifSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setAutoCancel(true)
                .setContentTitle("My App")
                .setContentText(message)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(icon);

        Notification notification = builder.build();
        notification.flags |= Notification.FLAG_AUTO_CANCEL;

        NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();
        bigText.bigText(message)
                .setBigContentTitle("My App")
                .setSummaryText("From: Admin");
        builder.setStyle(bigText);
        builder.setSound(notifSound);

        //Last Step
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}
