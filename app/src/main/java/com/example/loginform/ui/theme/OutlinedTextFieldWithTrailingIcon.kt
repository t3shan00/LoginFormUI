package com.example.loginform.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun OutlineTextFieldWithTrailingIcon(
    label: String,
    icon: ImageVector,
    value: String,
    contentDescription: String = "",
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false
){
    OutlinedTextField(
        value=(value),
        onValueChange = onValueChange,
        label={ Text(label) },
        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
        trailingIcon = {
            IconButton(onClick = {}) {
                Icon(icon, contentDescription = contentDescription)
            }
        },
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
    )
}