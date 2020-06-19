function log(msg)
{
    console.log(msg);
}
function rawInput(data)
{
    log('RECV: ' + data);
}
function rawOutput(data)
{
    log('SENT: ' + data);
}
function onConnect(status)
{
    if (status == Strophe.Status.CONNECTING) {
	    log('Strophe is connecting.');
    } else if (status == Strophe.Status.CONNFAIL) {
	    log('Strophe failed to connect.');
    } else if (status == Strophe.Status.DISCONNECTING) {
	    log('Strophe is disconnecting.');
    } else if (status == Strophe.Status.DISCONNECTED) {
	    log('Strophe is disconnected.');
	    handleDisconnected();

    } else if (status == Strophe.Status.CONNECTED) {
	    log('Strophe is connected.');
        handleConnected();
    } else if  (status == Strophe.Status.AUTHFAIL) {
        log('Strophe status:' + status);
        $.afui.hideMask();
        navigator.notification.alert("登录失败,请检查用户名和密码,或稍后重试！", null, "错误", "确定");
    } else {
        log('Strophe status:' + status);
    }
    con.receipts.statusChanged(status);//resend queued messages
}

function registerHandle(){
    con.receipts.addReceiptHandler(onMessage, null, null, null);//handle all messages, any message without receipt?
    con.addHandler(handleOfflineMessageNumber, Strophe.NS.DISCO_INFO, "iq", "result",null,null);
    con.addHandler(handleOfflineMessageHeaders, Strophe.NS.DISCO_ITEMS, "iq", "result");

    con.addHandler(handleRosterIQ, Strophe.NS.ROSTER, "iq", "set");

    con.addHandler(handlePresence, null, "presence", null);
    con.addHandler(handleError,null, null, "error");
}

Strophe.log = function(level, message) {
    var level_name, console_level;
    switch (level) {
      case Strophe.LogLevel.DEBUG:
        level_name = "DEBUG";
        console_level = "log";
        break;

      case Strophe.LogLevel.INFO:
        level_name = "INFO";
        console_level = "info";
        break;

      case Strophe.LogLevel.WARN:
        level_name = "WARN";
        console_level = "info";
        break;

      case Strophe.LogLevel.ERROR:
        level_name = "ERROR";
        console_level = "error";
        break;

      case Strophe.LogLevel.FATAL:
        level_name = "FATAL";
        console_level = "error";
        break;
    }
    console[console_level]("[Strophe][" + level_name + "]: " + message);
};