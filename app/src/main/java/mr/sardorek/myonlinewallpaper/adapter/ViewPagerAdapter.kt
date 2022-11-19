package mr.sardorek.myonlinewallpaper.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import mr.sardorek.myonlinewallpaper.fragmentSall.HomeFragment
import mr.sardorek.myonlinewallpaper.fragmentSall.MessageFragment
import mr.sardorek.myonlinewallpaper.fragmentSall.ProfilFragment
import mr.sardorek.myonlinewallpaper.fragmentSall.SearchFragment


class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 -> {
                HomeFragment()
            }
            1 -> {
                SearchFragment()
            }
            2 -> {
                MessageFragment()
            }
            3 -> {
                ProfilFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}
