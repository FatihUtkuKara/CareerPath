package com.example.careerpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.abs

class QuestionsActivity : AppCompatActivity() {
    private lateinit var seekBar1_2: SeekBar
    private lateinit var seekBar3_4: SeekBar
    private lateinit var seekBar5_1: SeekBar
    private lateinit var seekBar1_3: SeekBar
    private lateinit var seekBar2_4: SeekBar
    private lateinit var seekBar5_2: SeekBar
    private lateinit var seekBar1_4: SeekBar
    private lateinit var seekBar2_3: SeekBar
    private lateinit var seekBar5_3: SeekBar
    private lateinit var seekBar4_5: SeekBar
    private lateinit var buttonSubmit : TextView
    private lateinit var mainPage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        var X12 = 0.0
        var X13 = 0.0
        var X14 = 0.0
        var X15 = 0.0
        var X23 = 0.0
        var X24 = 0.0
        var X25 = 0.0
        var X34 = 0.0
        var X35 = 0.0
        var X45 = 0.0


        var X12_ = 0.0
        var X13_ = 0.0
        var X14_ = 0.0
        var X15_ = 0.0
        var X23_ = 0.0
        var X24_ = 0.0
        var X25_ = 0.0
        var X34_ = 0.0
        var X35_ = 0.0
        var X45_ = 0.0


        seekBar1_2 = findViewById(R.id.slider1)
        seekBar3_4 = findViewById(R.id.slider2)
        seekBar5_1 = findViewById(R.id.slider3)
        seekBar1_3 = findViewById(R.id.slider4)
        seekBar2_4 = findViewById(R.id.slider5)
        seekBar5_2 = findViewById(R.id.slider6)
        seekBar1_4 = findViewById(R.id.slider7)
        seekBar2_3 = findViewById(R.id.slider8)
        seekBar5_3 = findViewById(R.id.slider9)
        seekBar4_5 = findViewById(R.id.slider10)
        buttonSubmit = findViewById(R.id.buttonSubmitText)

        mainPage = findViewById(R.id.mainPage)
        mainPage.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        seekBar1_2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                    X12 = calculatedScore.toDouble()
                    X12_ = 1 / calculatedScore.toDouble()
                    // showToast("$calculatedScore Selected")
                }
                else {
                        calculatedScore = abs(calculatedScore)
                        X12 = 1 /calculatedScore.toDouble()
                        X12_ = calculatedScore.toDouble()
                }
            }


        })

        seekBar3_4.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X34 = calculatedScore.toDouble()
                X34_= 1 / calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X34 = 1 /calculatedScore.toDouble()
                    X34_ = calculatedScore.toDouble()
                }
            }


        })

        seekBar5_1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X15 = 1 /calculatedScore.toDouble()
                X15_=  calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X15 = calculatedScore.toDouble()
                    X15_ = 1 /calculatedScore.toDouble()
                }
            }


        })

        seekBar1_3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X13 = calculatedScore.toDouble()
                X13_= 1 / calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X13 = 1 /calculatedScore.toDouble()
                    X13_ = calculatedScore.toDouble()
                }
            }


        })

        seekBar2_4.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X24 = calculatedScore.toDouble()
                X24_= 1 / calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X24 = 1 /calculatedScore.toDouble()
                    X24_ = calculatedScore.toDouble()
                }
            }


        })

        seekBar5_2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X25 = 1 /calculatedScore.toDouble()
                X25_= calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X25 = calculatedScore.toDouble()
                    X25_ = 1 / calculatedScore.toDouble()
                }
            }


        })

        seekBar1_4.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X14 = calculatedScore.toDouble()
                X14_= 1 / calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X14 = 1 /calculatedScore.toDouble()
                    X14_ = calculatedScore.toDouble()
                }
            }


        })

        seekBar2_3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X23 = calculatedScore.toDouble()
                X23_= 1 / calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X23 = 1 /calculatedScore.toDouble()
                    X23_ = calculatedScore.toDouble()
                }
            }


        })

        seekBar5_3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X35 = 1 / calculatedScore.toDouble()
                X35_= calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X35 = calculatedScore.toDouble()
                    X35_ = 1 /calculatedScore.toDouble()
                }
            }


        })

        seekBar4_5.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                var calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                if(calculatedScore >0 ) {
                X45 = calculatedScore.toDouble()
                X45_= 1 / calculatedScore.toDouble()
                // showToast("$calculatedScore Selected")
                }
                else {
                    calculatedScore = abs(calculatedScore)
                    X45 = 1 /calculatedScore.toDouble()
                    X45_ = calculatedScore.toDouble()
                }
            }


        })

        buttonSubmit.setOnClickListener( ){
            var value1ColumnSum = X12_ + X13_ + X14_ + X15_ +1
            var value2ColumnSum = X12 + X23_ + X24_ + X25_ +1
            var value3ColumnSum = X13 + X23 + X34_ + X35_ +1
            var value4ColumnSum = X14 + X24 + X34 + X45_ +1
            var value5ColumnSum = X15 + X25 + X35 + X45 +1

            var ratioX11 = 1 / value1ColumnSum
            var ratioX12_ = X12_ / value1ColumnSum
            var ratioX13_ = X13_ / value1ColumnSum
            var ratioX14_ = X14_ / value1ColumnSum
            var ratioX15_ = X15_ / value1ColumnSum

            var ratioX12 = X12 / value2ColumnSum
            var ratioX22 = 1 / value2ColumnSum
            var ratioX23_ = X23_ / value2ColumnSum
            var ratioX24_ = X24_ / value2ColumnSum
            var ratioX25_ = X25_ / value2ColumnSum

            var ratioX13 = X13 / value3ColumnSum
            var ratioX23 = X23 / value3ColumnSum
            var ratioX33 = 1 / value3ColumnSum
            var ratioX34_ = X34_ / value3ColumnSum
            var ratioX35_ = X35_ / value3ColumnSum

            var ratioX14 = X14 / value4ColumnSum
            var ratioX24 = X24 / value4ColumnSum
            var ratioX34 = X34 / value4ColumnSum
            var ratioX44 = 1 / value4ColumnSum
            var ratioX45_ = X45_ / value4ColumnSum

            var ratioX15 = X15 / value5ColumnSum
            var ratioX25 = X25 / value5ColumnSum
            var ratioX35 = X35 / value5ColumnSum
            var ratioX45 = X45 / value5ColumnSum
            var ratioX55 = 1 / value5ColumnSum

            var eigenVectorV1 = (ratioX11+ ratioX12 + ratioX13 + ratioX14 + ratioX15) / 5
            var eigenVectorV2 = (ratioX12_+ ratioX22 + ratioX23 + ratioX24 + ratioX25) / 5
            var eigenVectorV3 = (ratioX13_+ ratioX23_ + ratioX33 + ratioX34 + ratioX35) / 5
            var eigenVectorV4 = (ratioX14_+ ratioX24_ + ratioX34_ + ratioX44 + ratioX45) / 5
            var eigenVectorV5 = (ratioX15_+ ratioX25_ + ratioX35_ + ratioX45_ + ratioX55) / 5

            var eigenValue1 = (1 * eigenVectorV1) + (X12 * eigenVectorV2) + (X13 * eigenVectorV3) + (X14 * eigenVectorV4) + (X15 * eigenVectorV5)
            var eigenValue2 = (X12_ * eigenVectorV1) + (1 * eigenVectorV2) + (X23 * eigenVectorV3) + (X24 * eigenVectorV4) + (X25 * eigenVectorV5)
            var eigenValue3 = (X13_ * eigenVectorV1) + (X23_ * eigenVectorV2) + (1 * eigenVectorV3) + (X34 * eigenVectorV4) + (X35 * eigenVectorV5)
            var eigenValue4 = (X14_ * eigenVectorV1) + (X24_ * eigenVectorV2) + (X34_ * eigenVectorV3) + (1 * eigenVectorV4) + (X45 * eigenVectorV5)
            var eigenValue5 = (X15_ * eigenVectorV1) + (X25_ * eigenVectorV2) + (X35_ * eigenVectorV3) + (X45_ * eigenVectorV4) + (1 * eigenVectorV5)

            val eigenVectorV11 = "eigenVectorV1" to eigenVectorV1
            val eigenVectorV21 = "eigenVectorV2" to eigenVectorV2
            val eigenVectorV31 = "eigenVectorV3" to eigenVectorV3
            val eigenVectorV41 = "eigenVectorV4" to eigenVectorV4
            val eigenVectorV51 = "eigenVectorV5" to eigenVectorV5

            var lambdaMax = ((eigenValue1/ eigenVectorV1) + (eigenValue2/ eigenVectorV2) + (eigenValue3/ eigenVectorV3) + (eigenValue4/ eigenVectorV4) + (eigenValue5/ eigenVectorV5)) /5

            var CI =  (lambdaMax- 5) / 4

            var CR =  CI / 1.11

            if (CR >0.10) {
                Toast.makeText(this,"CR ="+ String.format("%.2f", CR)+ " Please solve the test again; your CR value is too high.", Toast.LENGTH_LONG ).show()


            }

            else {

                val maxEigenVector = findMaxEigenValue(
                    eigenVectorV11,
                    eigenVectorV21,
                    eigenVectorV31,
                    eigenVectorV41,
                    eigenVectorV51
                )

                Toast.makeText(this, "CR =" + CR, Toast.LENGTH_LONG).show()

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("maxEigenVectorName", maxEigenVector.first)
                startActivity(intent)
            }
        }





    }


    private fun calculateScore(selectedValue: Int): Int {
        // Seçilen değere göre puanı hesapla (örneğin: 9-7-5-3-1-3-5-7-9)
        val scoreValues = intArrayOf(9, 7, 5, 3, 1, -3, -5,-7,-9)
        return scoreValues[selectedValue]
    }
    fun findMaxEigenValue(vararg eigenValues: Pair<String, Double>): Pair<String, Double> {
        return eigenValues.maxByOrNull { it.second } ?: throw IllegalArgumentException("Liste boş olamaz")
    }

}