package wit.org.pl

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.adding_game.*


class AddingGame: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adding_game)


        var poprawne = 0
        var niePoprawne = 0


            val number1 = (1..10).random()
            val number2 = (1..10).random()

            val sumNo1No2 = number1 + number2
            randomNumberTxtView.text = "number $number1 + $number2 is.."






        btnCheck.setOnClickListener {


            val userAnswer: Int = userAnswerNo.text.toString().toInt()

            if (sumNo1No2 == userAnswer) {
                poprawne++

                txtViewCorrect.text = "you have $poprawne correct"


            } else {

                niePoprawne++
                txtViewCorrect.text = "you have $txtViewIncorrect incorect"
            }
        }




        }




    }







