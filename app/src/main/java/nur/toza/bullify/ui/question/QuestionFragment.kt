package nur.toza.bullify.ui.question

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import nur.toza.bullify.R
import nur.toza.bullify.databinding.FragmentQuestionBinding
import nur.toza.bullify.databinding.FragmentStrartBinding

class QuestionFragment : Fragment() {
    private var _binding: FragmentQuestionBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var position = 0
        binding.btnNeonOne.setOnClickListener {
            position++
            when(position){
                1-> {
                    binding.llMain.visibility = View.GONE
                    binding.llMain2.visibility = View.VISIBLE
                    binding.llMain3.visibility = View.GONE
                }
                2-> {
                    binding.llMain.visibility = View.GONE
                    binding.llMain2.visibility = View.GONE
                    binding.llMain3.visibility = View.VISIBLE
                }
                3->{
                    findNavController().navigate(R.id.action_questionFragment_to_resultFragment)
                }
                else->{
                    binding.llMain.visibility = View.VISIBLE
                    binding.llMain2.visibility = View.GONE
                    binding.llMain3.visibility = View.GONE
                }
            }
        }
    }
}