package at.htl.tadeotfeedback

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import at.htl.tadeotfeedback.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentQuestionBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_question, container, false)

        binding.feedback1.setOnClickListener(this::navigateToSummaryFragment)
        binding.feedback2.setOnClickListener(this::navigateToSummaryFragment)
        binding.feedback3.setOnClickListener(this::navigateToSummaryFragment)
        binding.feedback4.setOnClickListener(this::navigateToSummaryFragment)
        binding.feedback5.setOnClickListener(this::navigateToSummaryFragment)

        return binding.root
    }

    private fun navigateToSummaryFragment(view: View) {
        view
            .findNavController()
            .navigate(R.id.action_questionFragment_to_summaryFragment)
    }

}