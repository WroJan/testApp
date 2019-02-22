package wit.org.pl

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        clickBtn.setOnClickListener {
            toast("button right clicked")
            txtViewChange.text = "button right"
        }

        btnChange.setOnClickListener {
            toast("button left clicked")

            txtViewChange.text = "butto left"
        }

        bottomBtn.setOnClickListener{
            val first = 1
            val second = 2
            val randomNo = (first..second).random()
            toast("The number $randomNo is random number")
            val game2Intent = Intent(this,AddingGame2::class.java)
            startActivity((game2Intent))

        }

        btnGoToGame.setOnClickListener {
            val intent = Intent(this, AddingGame::class.java)
            startActivity(intent)


        }

    }
}



