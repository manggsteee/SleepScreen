package hoang.phuc.sleepscreen.ui.components.button

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SaveButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier){
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xff0063fe),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(45.dp)
            .padding(horizontal = 16.dp),
        onClick = onClick
    ){
        Text(
            text = "Lưu"
        )
    }
}

@Preview
@Composable
fun SaveButtonReview(){
    SaveButton(onClick = {})
}