package wit.org.pl

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.adding_game2.*


class AddingGame2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adding_game2)

        val numberone = (1..10).random()
        val numbertwo = (1..10).random()
        var counter = 0.1


        btn_start_game2.setOnClickListener {

                txtView_instruction_game2.text = "Add $numberone + $numbertwo"
                counter++
            txtView_done_game2.text = "Counter equls to $counter"
            if(counter.equals(1)) {
                txtView_done_game2.text = "Counter equls TUTAccJ JEST UPDATE to $counter"
            }


        } 

    }


}
