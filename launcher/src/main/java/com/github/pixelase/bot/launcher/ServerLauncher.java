package com.github.pixelase.bot.launcher;

import java.io.IOException;

import com.github.pixelase.bot.api.ModuleTask;
import com.github.pixelase.bot.api.Server;
import com.github.pixelase.bot.core.BotServerTask;
import com.github.pixelase.bot.modules.example.ExampleChatTask;
import com.github.pixelase.bot.modules.example.ExampleModuleTask;

public class ServerLauncher {
	public static void main(String[] args) throws IOException, InterruptedException {
		ModuleTask moduleTask = new ExampleModuleTask(ExampleChatTask.class, "test_module.properties");
		Server server = new BotServerTask("server.properties", moduleTask);
		server.start();
	}
}
