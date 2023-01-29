package com.launcher.utils

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import java.util.*

class Utils {
    @Suppress("unused")
    private fun isDefaultLauncher(ctx: Context): Boolean {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        val resolveInfo =
            ctx.packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY)
        return resolveInfo != null && ctx.packageName == resolveInfo.activityInfo.packageName
    }

    companion object {
        //map
        //
        //play store
        //pdf viewer
        // popular and often used app on f droid and in android system
        // and some of my favourite apps
        @JvmStatic
        val oftenAppsList: List<String>
            get() {
                val list = arrayOf(
                    "com.google.android.apps.maps",  //map
                    "com.android.gallery3d",  //
                    "com.android.settings",
                    "com.android.mms",
                    "com.android.contacts",
                    "com.android.email",
                    "com.android.vending",  //play store
                    "com.android.chrome",
                    "com.android.calendar",
                    "org.thoughtcrime.securesms",
                    "org.telegram.messenger",
                    "com.whatsapp",
                    "org.sufficientlysecure.viewer",  //pdf viewer
                    "org.fdroid.fdroid",
                    "org.mozilla.firefox",
                    "org.schabi.newpipe",
                    "eu.faircode.email",
                    "com.simplemobiletools.gallery.pro",
                    "com.simplemobiletools.contacts.pro",
                    "com.simplemobiletools.calendar.pro",
                    "com.kunzisoft.keepas.libre",
                    "org.videolan.vlc",
                    "com.termux",
                    "com.nextcloud.android",
                    "ryey.easer.beta",
                    "it.niedermann.owncloud.notes",
                    "com.keylesspalace.tusky",
                    "de.nproth.pin",
                    "io.github.subhamtyagi.privacyapplock",
                    "superfreeze.tool.android",
                    "fr.gouv.etalab.mastodon",
                    "im.vector.alpha",
                    "com.nextcloud.client",
                    "com.duckduckgo.mobile.android",
                    "eu.siacs.conversations",
                    "org.torproject.torbrowser",
                    "com.aurora.adroid",
                    "net.osmand.plus",
                    "org.torproject.android",
                    "com.mediatek.filemanager",
                    "com.sec.android.gallery3d",
                    "com.sec.android.app.myfiles",
                    "com.android.dialer",
                    "com.android.camera",
                    "org.mozilla.fennec_fdroid",
                    "com.mi.android.globalFileexplorer",
                    "com.miui.gallery",
                    "com.miui.calculator",
                    "com.nonsenseapps.feeder",
                    "com.foobnix.pro.pdf.reader",
                    "com.mixplorer",
                    "io.github.subhamtyagi.ocr"
                )
                return listOf(*list)
            }

        @JvmStatic
        val coloredAppsList: List<String>
            get() {
                val list = arrayOf(
                    "com.android.settings",
                    "com.android.contacts",
                    "com.android.calendar",
                    "org.telegram.messenger",
                    "com.whatsapp",
                    "org.fdroid.fdroid",
                    "org.mozilla.firefox",
                    "org.schabi.newpipe",
                    "com.aurora.adroid",
                    "com.android.dialer",
                    "com.android.camera",
                    "org.mozilla.fennec_fdroid",
                    "com.miui.gallery",
                    "com.miui.calculator",
                    "com.foobnix.pro.pdf.reader",
                    "com.mixplorer",
                    "io.github.subhamtyagi.ocr"
                )
                return listOf(*list)
            }

        @JvmStatic
        fun generateColorFromString(string: String): Int {
            // List of material colors
            val colors = arrayOf(
                "#F44336",
                "#FFEBEE",
                "#FFCDD2",
                "#EF9A9A",
                "#E57373",
                "#EF5350",
                "#E53935",
                "#D32F2F",
                "#C62828",
                "#B71C1C",
                "#FF8A80",
                "#FF5252",
                "#FF1744",
                "#D50000",
                "#FCE4EC",
                "#F8BBD0",
                "#F48FB1",
                "#F06292",
                "#EC407A",
                "#E91E63",
                "#D81B60",
                "#C2185B",
                "#AD1457",
                "#880E4F",
                "#FF80AB",
                "#FF4081",
                "#F50057",
                "#C51162",
                "#F3E5F5",
                "#E1BEE7",
                "#CE93D8",
                "#BA68C8",
                "#AB47BC",
                "#9C27B0",
                "#8E24AA",
                "#7B1FA2",
                "#6A1B9A",
                "#4A148C",
                "#EA80FC",
                "#E040FB",
                "#D500F9",
                "#AA00FF",
                "#EDE7F6",
                "#D1C4E9",
                "#B39DDB",
                "#9575CD",
                "#7E57C2",
                "#673AB7",
                "#5E35B1",
                "#512DA8",
                "#4527A0",
                "#311B92",
                "#B388FF",
                "#7C4DFF",
                "#651FFF",
                "#6200EA",
                "#E8EAF6",
                "#C5CAE9",
                "#9FA8DA",
                "#7986CB",
                "#5C6BC0",
                "#3F51B5",
                "#3949AB",
                "#303F9F",
                "#283593",
                "#1A237E",
                "#8C9EFF",
                "#536DFE",
                "#3D5AFE",
                "#304FFE",
                "#E3F2FD",
                "#BBDEFB",
                "#90CAF9",
                "#64B5F6",
                "#42A5F5",
                "#2196F3",
                "#1E88E5",
                "#1976D2",
                "#1565C0",
                "#0D47A1",
                "#82B1FF",
                "#448AFF",
                "#2979FF",
                "#2962FF",
                "#E1F5FE",
                "#B3E5FC",
                "#81D4FA",
                "#4FC3F7",
                "#29B6F6",
                "#03A9F4",
                "#039BE5",
                "#0288D1",
                "#0277BD",
                "#01579B",
                "#80D8FF",
                "#40C4FF",
                "#00ACC1",
                "#0097A7",
                "#00838F",
                "#006064",
                "#84FFFF",
                "#18FFFF",
                "#00E5FF",
                "#00B8D4",
                "#E0F2F1",
                "#B2DFDB",
                "#80CBC4",
                "#4DB6AC",
                "#26A69A",
                "#009688",
                "#00897B",
                "#00796B",
                "#00695C",
                "#004D40",
                "#A7FFEB",
                "#64FFDA",
                "#1DE9B6",
                "#00BFA5",
                "#E8F5E9",
                "#C8E6C9",
                "#A5D6A7",
                "#81C784",
                "#66BB6A",
                "#4CAF50",
                "#43A047",
                "#388E3C",
                "#2E7D32",
                "#1B5E20",
                "#B9F6CA",
                "#69F0AE",
                "#00E676",
                "#00C853",
                "#F1F8E9",
                "#DCEDC8",
                "#C5E1A5",
                "#AED581",
                "#9CCC65",
                "#8BC34A",
                "#7CB342",
                "#689F38",
                "#558B2F",
                "#33691E",
                "#CCFF90",
                "#B2FF59",
                "#76FF03",
                "#64DD17",
                "#F9FBE7",
                "#F0F4C3",
                "#E6EE9C",
                "#DCE775",
                "#D4E157",
                "#CDDC39",
                "#C0CA33",
                "#AFB42B",
                "#9E9D24",
                "#827717",
                "#F4FF81",
                "#EEFF41",
                "#C6FF00",
                "#AEEA00",
                "#FFFDE7",
                "#FFF9C4",
                "#FFF59D",
                "#FFF176",
                "#FFEE58",
                "#FFEB3B",
                "#FDD835",
                "#FBC02D",
                "#F9A825",
                "#F57F17",
                "#FFFF8D",
                "#FFFF00",
                "#FFEA00",
                "#FFD600",
                "#FFF8E1",
                "#FFECB3",
                "#FFE082",
                "#FFD54F",
                "#FFCA28",
                "#FFC107",
                "#FFB300",
                "#FFA000",
                "#FF8F00",
                "#FF6F00",
                "#FFE57F",
                "#FFD740",
                "#FFC400",
                "#FFAB00",
                "#FFF3E0",
                "#FFE0B2",
                "#FFCC80",
                "#FFB74D",
                "#FFA726",
                "#FF9800",
                "#FB8C00",
                "#F57C00",
                "#EF6C00",
                "#E65100",
                "#FFD180",
                "#FFAB40",
                "#FF9100",
                "#FF6D00",
                "#FBE9E7",
                "#FFCCBC",
                "#FFAB91",
                "#FF8A65",
                "#FF7043",
                "#FF5722",
                "#F4511E",
                "#E64A19",
                "#D84315",
                "#BF360C",
                "#FF9E80",
                "#FF6E40",
                "#FF3D00",
                "#DD2C00",
                "#EFEBE9",
                "#D7CCC8",
                "#BCAAA4",
                "#A1887F",
                "#8D6E63",
                "#795548",
                "#6D4C41",
                "#5D4037",
                "#4E342E",
                "#3E2723",
                "#FAFAFA",
                "#F5F5F5",
                "#EEEEEE",
                "#E0E0E0",
                "#BDBDBD",
                "#9E9E9E",
                "#757575",
                "#616161",
                "#424242",
                "#212121",
                "#ECEFF1",
                "#CFD8DC",
                "#B0BEC5",
                "#90A4AE",
                "#78909C",
                "#607D8B",
                "#546E7A",
                "#455A64",
                "#37474F",
                "#263238",
                "#000000",
                "#00B0FF",
                "#0091EA",
                "#E0F7FA",
                "#B2EBF2",
                "#80DEEA",
                "#4DD0E1",
                "#26C6DA",
                "#00BCD4"
            )
            var choice = 0
            var i = string.length - 1
            while (i > 0) {
                choice += string.codePointAt(i)
                i -= 1
            }
            return Color.parseColor(colors[choice % colors.size])
        }

        @JvmStatic
        fun hash(text: String): Int {
            val data = text.toByteArray()
            val length = data.size
            val seed = -0x68b84d74
            val m = 0x5bd1e995
            val r = 24

            // Initialize the hash to a random value
            var h = seed xor length
            val length4 = length / 4
            for (i in 0 until length4) {
                val i4 = i * 4
                var k = ((data[i4].toInt() and 0xff) + (data[i4 + 1].toInt() and 0xff shl 8)
                        + (data[i4 + 2].toInt() and 0xff shl 16) + (data[i4 + 3].toInt() and 0xff shl 24))
                k *= m
                k = k xor (k ushr r)
                k *= m
                h *= m
                h = h xor k
            }
            when (length % 4) {
                3 -> {
                    h = h xor (data[(length and 3.inv()) + 2].toInt() and 0xff shl 16)
                    h = h xor (data[(length and 3.inv()) + 1].toInt() and 0xff shl 8)
                    h = h xor (data[length and 3.inv()].toInt() and 0xff)
                    h *= m
                }
                2 -> {
                    h = h xor (data[(length and 3.inv()) + 1].toInt() and 0xff shl 8)
                    h = h xor (data[length and 3.inv()].toInt() and 0xff)
                    h *= m
                }
                1 -> {
                    h = h xor (data[length and 3.inv()].toInt() and 0xff)
                    h *= m
                }
            }
            h = h xor (h ushr 13)
            h *= m
            h = h xor (h ushr 15)
            return h
        }

        /**
         * @param query   strings to be find
         * @param strings strings where to find
         * @return true if @query is sequentially found in @strings else false
         */
        @JvmStatic
        fun simpleFuzzySearch(
            query: CharSequence,
            strings: String
        ): Boolean {
            //convert to lowercase
            var sQuery = query
            var s = strings
            sQuery = sQuery.toString().lowercase(Locale.getDefault())
            s = s.lowercase(Locale.getDefault())
            var patternIdx = 0
            var strIdx = 0
            val patternLength = sQuery.length
            val strLength = s.length
            while (patternIdx != patternLength && strIdx != strLength) {
                val patternChar = sQuery[patternIdx]
                val strChar = s[strIdx]
                if (patternChar == strChar) ++patternIdx
                ++strIdx
            }
            return patternLength != 0 && strLength != 0 && patternIdx == patternLength
        }

        @JvmStatic
        val color: Int
            get() {
                val random = Random()
                when (random.nextInt(4)) {
                    0 -> return Color.parseColor("#FF5722")
                    1 -> return Color.parseColor("#FFEB3B")
                    2 -> return Color.parseColor("#03A9F4")
                    3 -> return Color.parseColor("#8BC34A")
                }
                return Color.parseColor("#FF5722")
            }

        @Suppress("unused")
        fun getDominantColor(bitmap: Bitmap?): Int {
            if (bitmap == null) {
                return Color.TRANSPARENT
            }
            val width = bitmap.width
            val height = bitmap.height
            val size = width * height
            val pixels = IntArray(size)
            //Bitmap bitmap2 = bitmap.copy(Bitmap.Config.ARGB_4444, false);
            bitmap.getPixels(pixels, 0, width, 0, 0, width, height)
            var color: Int
            var r = 0
            var g = 0
            var b = 0
            var a: Int
            var count = 0
            for (pixel in pixels) {
                color = pixel
                a = Color.alpha(color)
                if (a > 0) {
                    r += Color.red(color)
                    g += Color.green(color)
                    b += Color.blue(color)
                    count++
                }
            }
            r /= count
            g /= count
            b /= count
            r = r shl 16 and 0x00FF0000
            g = g shl 8 and 0x0000FF00
            b = b and 0x000000FF
            color = -0x1000000 or r or g or b
            return color
        }

        @Suppress("unused")
        fun drawableToBitmap(drawable: Drawable): Bitmap {
            if (drawable is BitmapDrawable) {
                if (drawable.bitmap != null) {
                    return drawable.bitmap
                }
            }
            val bitmap: Bitmap =
                if (drawable.intrinsicWidth <= 0 || drawable.intrinsicHeight <= 0) {
                    Bitmap.createBitmap(
                        1,
                        1,
                        Bitmap.Config.ARGB_8888
                    ) // Single color bitmap will be created of 1x1 pixel
                } else {
                    Bitmap.createBitmap(
                        drawable.intrinsicWidth,
                        drawable.intrinsicHeight,
                        Bitmap.Config.ARGB_8888
                    )
                }
            val canvas = Canvas(bitmap)
            drawable.setBounds(0, 0, canvas.width, canvas.height)
            drawable.draw(canvas)
            return bitmap
        }
    }
}
