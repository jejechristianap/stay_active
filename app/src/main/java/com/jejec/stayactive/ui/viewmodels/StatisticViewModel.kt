package com.jejec.stayactive.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.jejec.stayactive.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}