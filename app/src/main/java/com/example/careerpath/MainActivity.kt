package com.example.careerpath

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView

import android.widget.TextView
import java.util.concurrent.CompletableFuture


class MainActivity : AppCompatActivity() {
    private lateinit var buttonQuestion : TextView
    private lateinit var contactUsButton : TextView
    private lateinit var aboutUsButton : TextView

    private val messagesContent = mutableListOf<MessageContent>()
    private val apiClient = ApiClient.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonQuestion = findViewById(R.id.goToQuestion)
        contactUsButton = findViewById(R.id.contactUs)
        aboutUsButton = findViewById(R.id.aboutUs)

        buttonQuestion.setOnClickListener{
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }
        contactUsButton.setOnClickListener{
            val intent = Intent(this, ContactUsActivity::class.java)
            startActivity(intent)
        }
        aboutUsButton.setOnClickListener{
            val intent = Intent(this, AboutUsActivity::class.java)
            startActivity(intent)
        }


        val dataSource = ChatDataSource(this)
        dataSource.open()
        //ok.setOnClickListener {
           /* var question = questionText.text.toString()
            messagesContent.add(MessageContent(question, true))
            questionText.text.clear()
            dataSource.addMessage(1, question)
            val completionFuture = createChatCompletion(question)
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
            // true döndürerek event'in diğer listener'lara iletilmemesini sağlayın
            true
            completionFuture.thenApply { answer ->
                messagesContent.add(MessageContent(answer, false))
                dataSource.addMessage(2, answer)

                val messages: List<Pair<Int, String>> = dataSource.getAllMessages()


                for (message in messages) {
                    Log.d("Burada", "Message: $message")
                }

            }.exceptionally { throwable ->

                Log.e("Error", "data cannot receive")
*/
            }



        }


   /* private fun createChatCompletion(message: String): CompletableFuture<String> {
        val future = CompletableFuture<String>()

        try {
            val chatRequest = ChatRequest(
                arrayListOf(
                    Message(
                        "You are a Psychologist.You answer me like a Psychologist",
                        "system"

                    ),
                    Message(
                        message,
                        "user"
                    )
                ),
                "gpt-3.5-turbo"
            )
            apiClient.creatChatCımpletion(chatRequest).enqueue(object :
                retrofit2.Callback<ChatResponse> {
                override fun onResponse(
                    call: retrofit2.Call<ChatResponse>,
                    response: retrofit2.Response<ChatResponse>
                ) {
                    val code = response.code()
                    if (code == 200) {

                        val answer = response.body()?.choices?.get(0)?.message?.content.toString()
                        future.complete(answer)
                        Log.d("Real answer", answer)

                    } else {
                        future.completeExceptionally(Exception("Error response: ${response.errorBody()}"))

                        Log.d("error response", response.errorBody().toString())
                    }


                }

                override fun onFailure(call: retrofit2.Call<ChatResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })

        } catch (e: Exception) {
            future.completeExceptionally(e)

            e.printStackTrace()
        }

        Log.d("Returning answer", future.toString())
        return future
    } */
