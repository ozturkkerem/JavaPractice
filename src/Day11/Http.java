package Day11;

public class Http {
    public static void main(String[] args) {

        int number = 200;
        String result = " ";

        switch (number) {

            case 200:
                result = "OK";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 301:
                 result = "Moved Permanently";
                break;
            case 303:
                 result = "See Other";
                break;
            case 304:
                 result = "Not Modified";
                break;
            case 307:
                 result = "Temporary Redirect";
                break;
            case 400:
                 result = "Bad Request";
                break;

            case 401:
                 result = "Unauthorized";
                break;

            case 403:
                 result = "Forbidden";
                break;

            case 404:
                 result = "Not Found";
                break;

            case 410:
                 result = "Gone";
                break;

            case 500:
                 result = "Internal Server Error";
                break;

            case 503:
                 result = "Service Unavailable";
                break;

            default:
                result = "invalid code";

        }

        System.out.println(result);
    }


}


/*                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable
*/