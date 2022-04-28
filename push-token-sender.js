var apn = require('apn');

const config = {
    production: false, /* change this to true when in production */
    token: {
        key: "key.p8",
        keyId: "key-id",
        teamId: "developer-team-id"
    }
};

const apnProvider = new apn.Provider(config);



function sendPkToken(tokens, payload) {

    const notification = new apn.Notification();




    notification.topic = 'com.devlomi.fireapp.voip'; // you have to keep the .voip here
    notification.payload = payload

    return apnProvider.send(notification, tokens)


}
module.exports.sendPkToken = sendPkToken;
