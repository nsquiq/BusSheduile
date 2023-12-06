package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface BusScheduleDao {
   @Query("SELECT * from busschedule ORDER BY arrival_time")
   fun getBusSchedule(): Flow<List<BusSchedule>>

   @Query(
       "SELECT * FROM busschedule WHERE stop_name = :stopName ORDER BY arrival_time"
   )
   fun getByStopName(stopName:String):Flow<List<BusSchedule>>

}