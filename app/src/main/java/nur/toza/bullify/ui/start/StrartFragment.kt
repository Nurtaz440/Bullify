package nur.toza.bullify.ui.start

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.core.content.ContextCompat.getColor
import androidx.navigation.fragment.findNavController
import nur.toza.bullify.R
import nur.toza.bullify.databinding.FragmentStrartBinding


class StrartFragment : Fragment() {
    private var _binding: FragmentStrartBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        _binding = FragmentStrartBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       binding.btnNeonOne.setOnClickListener{
           findNavController().navigate(R.id.action_strartFragment_to_questionFragment)
       }
    }
}