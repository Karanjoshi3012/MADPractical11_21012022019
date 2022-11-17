# MADPractical11_21012022019

Study: SQlite Database, RecyclerView, Broadcast Receiver, Service, Notification, Custom Alert Dialog Box, Time Picker Dialog, AlarmManager

AIM: Create Note Android Application that can add Note, edit Note, delete Note, and set reminder date & time of note. By using Broadcast Receiver, AlarmManager set reminder of note. By using SQLite, store all notes data.

Create two Activities like MainActivity, NoteViewActivity according to below UI design.

Use RecyclerView Code from Practical-9 to display Note Data.

Use Broadcast Receiver, Time Picker Dialog, service & AlarmManager code from Practical-7

Create Note class with member variables like id, title, subTitle, Description, modifiedTime, reminderTime:Long, isReminderEnable:Boolean & create membor methods like getCurrentDateTime(), getMillis(), setReminder(), isValid(), getReminderText(), saveNote(), getHour(), getMinute(), calculateReminder() 

Create DatabaseHelper Class for SQlite with member methods like insertNote(), getNote(id), getAllNotes(), getNotesCount(), updateNote(), deleteNote().

Use Databinding in gradle file to easy way integrate xml into kotlin file

Use Material 3 design for UI

create class NotesData with companion object and it will store column name of table and create table query.

Create NoteViewActivity. It will show while reminder notification is turned up and user click on notification. It will also show when click on Note in recyclerView. After clicking on notification NoteViewActivity should be open with full description of that note. 

Note should be deleted by clicking on icon of Delete. Note should not be added if any one field of note is empty.

Some notes have reminder time so add reminder time in alarmManager with note id & it should be receive in broadcast receiver & in broadcast receiver notification should be generated with title & description of note.

If More than one notes have reminder time then notification should be displayed for each note separately.

Create Common Custom Dialog Box for add, edit note.

Create RecyclerView & its adapter to display all notes.


![Screenshot_20221116_201050](https://user-images.githubusercontent.com/110646988/202231450-5f9d1bf3-3816-469e-b2b1-0b8e358bef57.png)


![Screenshot_20221116_200821](https://user-images.githubusercontent.com/110646988/202231545-84b0a536-940a-4a1f-97dc-3e83bb55e70d.png)


![Screenshot_20221116_200844](https://user-images.githubusercontent.com/110646988/202231574-4d171a6b-2754-4cd4-b913-3d97bda827d7.png)


![Screenshot_20221116_201011](https://user-images.githubusercontent.com/110646988/202231611-1a95ca7e-10bf-4ba6-a37a-0040bf5dab1b.png)


![Screenshot_20221116_201021](https://user-images.githubusercontent.com/110646988/202231633-891f1414-f8a7-4ffa-94a5-57a9d4690adc.png)


![Screenshot_20221116_201034](https://user-images.githubusercontent.com/110646988/202231653-fb6f24c2-e293-4455-b051-a0cc373893bc.png)

