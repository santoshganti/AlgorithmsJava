using Microsoft.Azure.Functions.Worker;
using Microsoft.Azure.Functions.Worker.Http;
using Microsoft.Extensions.Logging;
using System.Net;

namespace LeetCode.SortingAlgorithms
{
    public class SelectionSort
    {
        private readonly ILogger _logger;

        public SelectionSort(ILoggerFactory loggerFactory)
        {
            _logger = loggerFactory.CreateLogger<SelectionSort>();
        }

        [Function("SelectionSort")]
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
