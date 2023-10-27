package com.example.pertemuan5

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pertemuan5.data.dataform
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class cobaviewmodel : ViewModel() {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    var eMail: String by mutableStateOf("")
        private set
    var alamat: String by mutableStateOf("")
        private set
    private val  _uiState = MutableStateFlow(dataform())
    val uiState: StateFlow<dataform> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, jk: String, eml: String){
        namaUsr = nm;
        noTlp = tlp;
        jenisKl = jk;
        eMail = eml;
    }

    fun setJenisK(pilihJK: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
}