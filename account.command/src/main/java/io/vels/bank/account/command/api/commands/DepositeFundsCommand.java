package io.vels.bank.account.command.api.commands;

import io.vels.bank.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class DepositeFundsCommand extends BaseCommand {
    private double amount;
}
