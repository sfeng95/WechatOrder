<html>
    <head>
        <meta charset="UTF-8">
        <title>订单列表</title>
        <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="/MP_verify_c55vJEOIet1cNhSO.txt">
    </head>

    <body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <h3>
                    订单列表
                </h3>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>订单编号 </th>
                        <th>买家姓名</th>
                        <th>买家手机号</th>
                        <th>买家地址</th>
                        <th>买家openId</th>
                        <th>订单总金额</th>
                        <th>订单状态</th>
                        <th>支付状态</th>
                        <th colspan="2">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list orderDTOS.getContent() as orderDTO>
                    <tr>
                        <td>${orderDTO.orderId}</td>
                        <td>${orderDTO.buyerName}</td>
                        <td>${orderDTO.buyerPhone}</td>
                        <td>${orderDTO.buyerAddress}</td>
                        <td>${orderDTO.buyerOpenid}</td>
                        <td>${orderDTO.orderAmount}</td>
                        <td>${orderDTO.orderStatus}</td>
                        <td>${orderDTO.payStatus}</td>
                        <td>详情</td>
                        <td>取消</td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    </body>
</html>