package managers

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity

class PrefsManager private constructor(context: Context){
    private val sharedPreferences: SharedPreferences?

    companion object{
        private var  prefsManager: PrefsManager? = null

        fun getInstance(context: Context): PrefsManager?{
            if(prefsManager == null){
                prefsManager = PrefsManager(context)
            }
            return prefsManager
        }
    }

    init {
        sharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    }

    fun saveData(key: String?, value: String?) {
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putString(key, value)
        prefsEditor.apply()
    }

    fun loadData(key: String?, default: String): String? {
        return sharedPreferences!!.getString(key,default)
    }

//    fun removeEmail() {
//        val prefs = applicationContext.getSharedPreferences("MyPref",
//            AppCompatActivity.MODE_PRIVATE
//        )
//        val editor = prefs.edit()
//        editor.remove("email")
//        editor.apply()
//    }

//    fun clearAll() {
//        val prefs = applicationContext.getSharedPreferences("MyPref",
//            AppCompatActivity.MODE_PRIVATE
//        )
//        val editor = prefs.edit()
//        editor.clear()
//        editor.apply()
//    }

    fun getData(key: String?): String?{
        return if(sharedPreferences != null) sharedPreferences.getString(key, "") else "en"
    }
}