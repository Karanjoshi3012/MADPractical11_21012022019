package com.example.MadPractical11_21012022019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.view.WindowCompat
import com.example.MadPractical11_21012022019.databinding.ActivityNoteViewBinding


class NoteViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNoteViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        note = intent.getSerializableExtra("Object") as Note
        binding = ActivityNoteViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
           with(note)
            binding.noteTitle.text = this.title
        binding.notSubtitle.text = this.subTitle
        binding.noteContent.text = this.Description
        binding.noteDate.text = this.modifiedtime
        this.calcReminder()
        if(this.isReminder)
        {
            binding.noteReminderdatetime.visibility = view.VISIBLE
            binding.noteReminderDateTime.text = this.getReminder.Text()
        }
        else
            binding.noteReminderDateTime.visibility = view.GONE
    }
}