package com.defense.notecase;

import android.content.Context;
import android.os.Vibrator;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    // Notification channel ID.
    private static final String PRIMARY_CHANNEL_ID =
            "officers_noteCase_primary_notification_channel";

    private static final int NOTIFICATION_ID = 0;

    @Override
    public void onNewToken(String token) {
        Log.d("FirebaseInstanceId", "Refreshed token: " + token);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // FCM registration token to your app server.
//        sendRegistrationToServer(token);

        
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        showNotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
    }

    private void showNotification(String title, String body) {

        NotificationCompat.Builder builder=new NotificationCompat
                .Builder(this, PRIMARY_CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(body)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_HIGH);
        NotificationManagerCompat managerCompat= NotificationManagerCompat.from(this);
        managerCompat.notify(NOTIFICATION_ID,builder.build());


    }
}
