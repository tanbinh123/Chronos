package tinder.gold.adventures.chronos.model.traffic.sensor

import tinder.gold.adventures.chronos.model.traffic.control.ITrafficControl

interface ISensor : ITrafficControl {
    enum class ActuationState {
        ACTUATED,
        NON_ACTUATED
    }

    var state: ActuationState
        get
        set
}