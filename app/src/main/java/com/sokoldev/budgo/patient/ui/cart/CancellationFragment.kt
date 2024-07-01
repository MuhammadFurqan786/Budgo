package com.sokoldev.budgo.patient.ui.cart

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.sokoldev.budgo.databinding.FragmentCancellationBinding
import com.sokoldev.budgo.patient.ui.payment.AddPaymentActivity

class CancellationFragment : Fragment() {
    private var _binding: FragmentCancellationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCancellationBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.apply {

            continueButton.setOnClickListener {
                val isChecked = checkBox.isChecked
                if (isChecked) {
                    startActivity(Intent(context, AddPaymentActivity::class.java))
                } else {
                    Toast.makeText(
                        context,
                        "Please Read Policy and confirm checkbox first",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}