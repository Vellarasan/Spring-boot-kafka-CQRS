package io.vels.bank.account.command.api.commands;

import io.vels.bank.account.common.dto.AccountType;
import io.vels.bank.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;

}
