package com.kbyai.facerecognition

import android.content.Intent
import android.content.pm.ResolveInfo
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kbyai.facerecognition.R


class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        findViewById<TextView>(R.id.txtMail).setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "plain/text"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("nabaruproy.dev@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "License Request")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            startActivity(Intent.createChooser(intent, ""))
        }

        findViewById<TextView>(R.id.txtWhatsapp).setOnClickListener {
            val general = Intent(Intent.ACTION_VIEW, Uri.parse(""))
            val generalResolvers: HashSet<String> = HashSet()
            val generalResolveInfo: List<ResolveInfo> = packageManager.queryIntentActivities(general, 0)
            for (info in generalResolveInfo) {
                if (info.activityInfo.packageName != null) {
                    generalResolvers.add(info.activityInfo.packageName)
                }
            }

            val telegram = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/8768943180"))
            var goodResolver = 0

            val resInfo: List<ResolveInfo> = packageManager.queryIntentActivities(telegram, 0)
            if (!resInfo.isEmpty()) {
                for (info in resInfo) {
                    if (info.activityInfo.packageName != null && !generalResolvers.contains(info.activityInfo.packageName)) {
                        goodResolver++
                        telegram.setPackage(info.activityInfo.packageName)
                    }
                }
            }

            if (goodResolver != 1) {
                telegram.setPackage(null)
            }
                    }


    }
}