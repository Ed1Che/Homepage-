package com.example.homepage

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.homepage.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the CardViews by their IDs
        val goalSetterCard: CardView = findViewById(R.id.goalSetterCard)
        val dietPlannerCard: CardView = findViewById(R.id.dietPlannerCard)
        val foodSearchCard: CardView = findViewById(R.id.foodSearchCard)
        val bmiCard: CardView = findViewById(R.id.bmiCard)
        val recipesCard: CardView = findViewById(R.id.recipesCard)
        val recommendationsCard: CardView = findViewById(R.id.recommendationsCard)

        // Set click listeners for each CardView
        goalSetterCard.setOnClickListener {
            Toast.makeText(this, "Goal Setter Clicked", Toast.LENGTH_SHORT).show()
            // Start the Goal Setter Activity or perform any action
            // startActivity(Intent(this, GoalSetterActivity::class.java))
        }

        dietPlannerCard.setOnClickListener {
            Toast.makeText(this, "Diet Planner Clicked", Toast.LENGTH_SHORT).show()
            // Start the Diet Planner Activity or perform any action
            // startActivity(Intent(this, DietPlannerActivity::class.java))
        }

        foodSearchCard.setOnClickListener {
            Toast.makeText(this, "Food Search Clicked", Toast.LENGTH_SHORT).show()
            // Start the Food Search Activity or perform any action
            // startActivity(Intent(this, FoodSearchActivity::class.java))
        }

        bmiCard.setOnClickListener {
            Toast.makeText(this, "BMI Clicked", Toast.LENGTH_SHORT).show()
            // Start the BMI Activity or perform any action
            // startActivity(Intent(this, BMIActivity::class.java))
        }

        recipesCard.setOnClickListener {
            Toast.makeText(this, "Recipes Clicked", Toast.LENGTH_SHORT).show()
            // Start the Recipes Activity or perform any action
            // startActivity(Intent(this, RecipesActivity::class.java))
        }

        recommendationsCard.setOnClickListener {
            Toast.makeText(this, "Recommendations Clicked", Toast.LENGTH_SHORT).show()
            // Start the Recommendations Activity or perform any action
            // startActivity(Intent(this, RecommendationsActivity::class.java))
        }
    }
}
