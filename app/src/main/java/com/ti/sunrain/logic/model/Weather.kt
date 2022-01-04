package com.ti.sunrain.logic.model


data class Weather(val realtime:RealtimeResponse.Realtime,
                   val daily:DailyResponse.Daily,
                   val realtimeResponse:RealtimeResponse,
                   val wind: RealtimeResponse.Wind,
                   val hourly:HourlyResponse.Result.Hourly,
                   val minutely:MinutelyResponse.Result.Minutely)