using Microsoft.Azure.Functions.Worker;
using Microsoft.Azure.Functions.Worker.Http;
using Microsoft.Extensions.Logging;
using System.Net;

namespace LeetCode.DataStructures.Arrays.ArrayRotation
{
    public class ArrayRotation
    {
        private readonly ILogger _logger;

        public ArrayRotation(ILoggerFactory loggerFactory)
        {
            _logger = loggerFactory.CreateLogger<ArrayRotation>();
        }

        [Function("ArrayRotation")]
        public HttpResponseData Run([HttpTrigger(AuthorizationLevel.Function, "get", "post")] HttpRequestData req)
        {
            _logger.LogInformation("C# HTTP trigger function processed a request.");

            var response = req.CreateResponse(HttpStatusCode.OK);
            response.Headers.Add("Content-Type", "text/plain; charset=utf-8");

            response.WriteString("Welcome to Azure Functions!");

            return response;
        }
    }
}
