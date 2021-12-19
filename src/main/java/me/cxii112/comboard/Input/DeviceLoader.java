package me.cxii112.comboard.Input;

import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeviceLoader
{
//    private static final ControllerEnvironment ENV = ControllerEnvironment.getDefaultEnvironment();

    public static List<Controller> getGamepads()
    {
        return Arrays.stream(ControllerEnvironment.getDefaultEnvironment().getControllers())
                .filter(controller -> controller.getType().equals(Controller.Type.GAMEPAD))
                .collect(Collectors.toList());
    }

    public static List<Controller> getAllControllers()
    {
        return Arrays.stream(ControllerEnvironment.getDefaultEnvironment().getControllers())
                .collect(Collectors.toList());
    }

    public static Boolean isSupported()
    {
        return ControllerEnvironment.getDefaultEnvironment().isSupported();
    }
}
