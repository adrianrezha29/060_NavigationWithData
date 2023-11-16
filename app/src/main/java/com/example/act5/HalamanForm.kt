package com.example.act5

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClick: (MutableList<String>) -> Unit
){
    var namaTxt by rememberSaveable {
        mutableStateOf("")
    }
    var alamatTxt by remember {
        mutableStateOf("")
    }
    var telponTxt by remember {
        mutableStateOf("")
    }
    var ListDataTxt: MutableList<String> = mutableListOf(namaTxt, alamatTxt, telponTxt)
}