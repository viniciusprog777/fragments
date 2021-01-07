package br.senai.sp.jandira.testefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatDialogFragment
import br.senai.sp.jandira.testefragment.fragments.ConsoleFragment
import br.senai.sp.jandira.testefragment.fragments.GameFragment
import br.senai.sp.jandira.testefragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(),
    View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var home: Button
    private lateinit var console: Button
    private lateinit var game: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var consoleFragment: ConsoleFragment
    private lateinit var gameFragment: GameFragment

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home = findViewById(R.id.button_home)
        home.setOnClickListener(this)
        console = findViewById(R.id.button_consoles)
        console.setOnClickListener(this)
        game = findViewById(R.id.button_games)
        game.setOnClickListener(this)

        homeFragment = HomeFragment()
        consoleFragment = ConsoleFragment()
        gameFragment = GameFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()

    }

    override fun onClick(v: View) {
      when (v.id) {
        R.id.button_home -> {
            supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
        }
        R.id.button_consoles -> {
            supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()
        }
        R.id.button_games -> {
            supportFragmentManager.beginTransaction().replace(R.id.frame, gameFragment).commit()
        }
      }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu_home ->{
                supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
            }
            R.id.menu_console ->{
                supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()

            }
            R.id.menu_game ->{
                supportFragmentManager.beginTransaction().replace(R.id.frame, gameFragment).commit()

            }
        }
        return true
    }
}