package com.example.creatsignindemo.createacc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.creatsignindemo.R
import com.example.creatsignindemo.components.HeaderTitle
import com.example.creatsignindemo.components.InputLabel
import com.example.creatsignindemo.components.PasswordInput
import com.example.creatsignindemo.components.PrimaryButton
import com.example.creatsignindemo.components.RoundCheckBox
import com.example.creatsignindemo.components.RowText
import com.example.creatsignindemo.components.TextInput

//this is create account screen
@Composable
fun CreateAccountScreen(
    navigateToSignIn: () -> Unit
){
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }

    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {

    Column (
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        HeaderTitle(title = stringResource(R.string.create_account))

        Spacer(modifier = Modifier.height(24.dp))

        InputLabel(label = stringResource(R.string.username))

        TextInput(value = username,
            onValueChange = { username = it },
            placeholder = stringResource(R.string.your_username)
        )

        Spacer(modifier = Modifier.height(12.dp))

        InputLabel(label = stringResource(R.string.email))

        TextInput(
            value = email,
            onValueChange = { email = it },
            placeholder = stringResource(R.string.your_email)
        )

        Spacer(modifier = Modifier.height(12.dp))

        InputLabel(label = stringResource(R.string.password))

        PasswordInput(
            value = password,
            onValueChange = { password = it },
            placeholder = stringResource(R.string.your_password)
        )

        Spacer(modifier = Modifier.height(8.dp))

        RoundCheckBox(title = stringResource(R.string.i_accept_the_terms_and_privacy_policy),
            isChecked = isChecked,
            onCheckChange = { isChecked = it })

        Spacer(modifier = Modifier.height(24.dp))

        PrimaryButton(
            title = stringResource(R.string.sign_up),
            onClick = navigateToSignIn
        )

        Spacer(modifier = Modifier.height(16.dp))

        RowText(
            text1 = stringResource(R.string.already_have_an_account),
            text2 = stringResource(R.string.log_in),
            onClickText2 = navigateToSignIn,
            modifier = Modifier.align(CenterHorizontally)
        )

    }
    }

}