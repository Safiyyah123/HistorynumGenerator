package com.aswani.historynumgenerator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //This is a function to create a immutable map

    //The random ages 15 to 100 covers 10 famous dead people in history
    //inclusive of 10 different people

    //The numbers 15 to 100 represent the ages of the famous dead people compared to users age.
    //The ages represent the age they died.

    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialise
        searchButton= findViewById(R.id.searchButton)
        resultTextView= findViewById(R.id.resultTextView)
        ageInput= findViewById(R.id.ageInput)
        clearButton= findViewById(R.id.clearButton)

        searchButton.setOnClickListener {
            val famousPeople = ageInput.text.toString().toIntOrNull()

            if (famousPeople != null && famousPeople in 20..100) {
                val famousPeople = when (famousPeople) {
                    20 -> "Andrew Goodman who was an volunteer  for the Freedom Summer campaign that sought to register African-Americans to vote in Mississippi and to set up Freedom Schools for black Southerners."
                    27 -> "Janis Lyn Joplin who received 5 awards during her life time. The biggest award was the Star on The Walk Of Fame."
                    36 -> "Princess Diana who was a member of the British Royal Family which activism and glamour made her an international icon."
                    42 -> "Elvis Presley who won three Grammy Awards received the Grammy Lifetime Achievement Award at age 36."
                    56 -> "Steven Paul Jobs who founded Apple Inc. in 1976 and transformed the company into a world leader in telecommunications."
                    67 -> "Leonardo Da Vinci who was an Italian polymath of the High Renaissance who was active as a painter, draughtsman, engineer, scientist, theorist, sculptor, and architect."
                    78 -> "Mahatma Gandhi who was a prominent leader in the Indian independence movement against British colonial rule."
                    80 -> "Sir Winston Churchill who was a British statesman, writer, and military leader who was widely regarded as one of the greatest figures of the 20th century."
                    90 -> "Hebert Hoover who was the 31st President of the United States.it coincided with the onset of the Great Depression,the worst economic downturn in the history of the  United States."
                    100 -> "Annie Lee Cooper who was an African American civil rights activist known for her role in the voting rights struggle in Selma, Alabama, during the 1960s."
                    else -> null
                }
                //This checks the age is not null and if it is within
                //the range of 20 to 100

                val message =
                    if (famousPeople != null) "Your age matches with the famous historical figure, $famousPeople."
                    else "No famous person found with the age entered."
                resultTextView.text = message

            } else {
                resultTextView.text = "Invalid Input. Please enter a valid age between 20 and 100."

            }
        }
            clearButton.setOnClickListener {
                ageInput.text.clear()
                resultTextView.text = ""
            }
            }
        }




