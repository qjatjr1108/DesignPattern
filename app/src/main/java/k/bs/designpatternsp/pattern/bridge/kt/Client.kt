package k.bs.designpatternsp.pattern.bridge.kt

fun main() {
    var tvRemoteControl = RemoteControl(appliance = TV())
    tvRemoteControl.turnOn()
    var fancyVacuumCleanerRemoteControl = RemoteControl(appliance = VacuumCleaner())
    fancyVacuumCleanerRemoteControl.turnOn()
}