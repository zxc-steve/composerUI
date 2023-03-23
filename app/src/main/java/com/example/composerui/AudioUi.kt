package com.example.composerui
enum class PlayingSource{
    Microphone,Buffer,Generator
}
data class AudioUi(
    var isRecording:Boolean,
    var isPlaying:Boolean,
    val playingSource:PlayingSource
)
