package com.example.currencyconversionapp.paid

import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.View
import com.example.currencyconversionapp.CommonFragment


class DataFragment : CommonFragment() {

    lateinit var clipboardManager: ClipboardManager

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clipboardManager = requireActivity().getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        binding.copy1Btn.setOnClickListener { viewModel.copy(1, clipboardManager) }
        binding.copy2Btn.setOnClickListener { viewModel.copy(2, clipboardManager) }
        binding.btnChange.setOnClickListener { viewModel.changeFields() }
    }








}


