package br.senai.sp.jandira.testefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import br.senai.sp.jandira.testefragment.fragments.ConsoleFragment
import br.senai.sp.jandira.testefragment.fragments.GameFragment
import br.senai.sp.jandira.testefragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),
    View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {

//    private lateinit var home: Button
//    private lateinit var console: Button
//    private lateinit var game: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var consoleFragment: ConsoleFragment
    private lateinit var gameFragment: GameFragment

    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var navigationView: NavigationView

    private lateinit var toolbar: Toolbar

    private lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navigation_layout)

////        home = findViewById(R.id.button_home)
//        home.setOnClickListener(this)
////        console = findViewById(R.id.button_consoles)
//        console.setOnClickListener(this)
////        game = findViewById(R.id.button_games)
//        game.setOnClickListener(this)

        homeFragment = HomeFragment()
        consoleFragment = ConsoleFragment()
        gameFragment = GameFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)
        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)

        toolbar = findViewById(R.id.toolbar)
        toolbar.setTitle("Home")
        setSupportActionBar(toolbar)


        drawer = findViewById(R.id.drawer_layout)

        var toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.open_drawer, R.string.close_drawer)

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        setFragment(homeFragment)

    }

    override fun onClick(v: View) {
//      when (v.id) {
//        R.id.button_home -> {
//            supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
//        }
//        R.id.button_consoles -> {
//            supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()
//        }
//        R.id.button_games -> {
//            supportFragmentManager.beginTransaction().replace(R.id.frame, gameFragment).commit()
//        }
//      }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu_home ->{
                setFragment(homeFragment)
                toolbar.setTitle("Home")
            }
            R.id.menu_console ->{
                setFragment(consoleFragment)
                toolbar.setTitle("Consoles")


            }
            R.id.menu_game ->{
                setFragment(gameFragment)
                toolbar.setTitle("Games")
            }
        }

    var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.setChecked(true)
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START)
    }
        return true
    }

    fun setFragment(fragment: Fragment){
            supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).commit()
    }

}