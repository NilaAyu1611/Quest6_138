package com.example.latihanhalaman.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.latihanhalaman.view.screen.MahasiswaFormView
import com.example.latihanhalaman.view.screen.RencanaStudyView
import com.example.latihanhalaman.view.screen.SplashView
import com.example.latihanhalaman.view.screen.TampilView
import com.example.latihanhalaman.view.viewmodel.MahasiswaViewModel
import com.example.latihanhalaman.view.viewmodel.RencanaStudyViewModel

enum class Halaman{
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil

}

@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    val mahasiswaUiState by viewModel.statusUI.collectAsState()

}


