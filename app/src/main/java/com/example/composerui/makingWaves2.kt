package com.example.composerui
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MakingWaves2Preview(){
    MakingWaves2(AudioUi(false,false,PlayingSource.Buffer))
}
@Composable
fun MakingWaves2(audioUi:AudioUi){
    val (isRecording,isPlaying,playingSource)=audioUi
    Column() {
        Text(text="")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Hold to record",modifier = Modifier.weight(1f, fill = true))
            Checkbox(checked = isRecording, onCheckedChange = {audioUi.isRecording=!it})
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Hold to play",modifier = Modifier.weight(1f, fill = true))
            Checkbox(checked = isPlaying, onCheckedChange = {})
        }
        Text(
            text = when (playingSource) {
                PlayingSource.Microphone -> "Microphone"
                PlayingSource.Buffer -> "Buffer"
                PlayingSource.Generator -> "Generator"
            }
        )
    }
}