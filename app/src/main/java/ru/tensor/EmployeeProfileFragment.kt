package ru.tensor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.tensor.databinding.FragmentEmployeeProfileBinding

class EmployeeProfileFragment : Fragment(R.layout.fragment_employee_profile) {
    companion object {
        private const val EMPLOYEE_KEY = "EMPLOYEE_KEY"

        fun newInstance(employee: Employee): EmployeeProfileFragment {
            return EmployeeProfileFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(EMPLOYEE_KEY, employee)
                }
            }
        }
    }

    private var _binding: FragmentEmployeeProfileBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEmployeeProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val employee = requireArguments().getParcelable<Employee>(EMPLOYEE_KEY)!!

        binding.name.text = employee.fullName
        binding.position.text = employee.position
        binding.achievements.text = employee.achievements
        binding.email.text = employee.email
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}