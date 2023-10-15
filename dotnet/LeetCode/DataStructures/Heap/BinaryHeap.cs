using System.Net;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Azure.Functions.Worker.Http;
using Microsoft.Extensions.Logging;

/**
 * It's a complete tree except possibly the last level and even in that last level. All the keys are as left as possible.
 *
 * This property of the binary heap makes them suitable to be store in an array
 *
 * Min Heap - the key at the root must be minimum among all the keys present in the binary heap. This must be
 * true for all the keys present in the binary heap.
 *
 * Max Heap - the key at the root must be the max among all the keys present in the binary tree. This must be recursively
 * true for all the keys in the binary heap.
 *
 *
 * Min Heap
 *
 *          10                            10
 *         /  \                        /       \
 *        20    100                   15       30
 *       /                           /  \      /  \
 *      30                          40   50   100  40
 *
 *
 */

namespace LeetCode.DataStructures.Heap
{
    public class BinaryHeap
    {
        private readonly ILogger _logger;

        public BinaryHeap(ILoggerFactory loggerFactory)
        {
            _logger = loggerFactory.CreateLogger<BinaryHeap>();
        }

        [Function("BinaryHeap")]
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
