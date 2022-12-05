<!DOCTYPE html><html lang=en><head><base href=/ ><meta charset=utf-8><meta http-equiv=X-UA-Compatible content="IE=edge"><meta name=title content=EventStorming2Code><meta name=description content="EventStorming to Code Generator"><meta name=image content=https://user-images.githubusercontent.com/54785805/120609107-dbfa1f80-c48c-11eb-8928-2bba293d464e.png><meta name=description content="비대면 MSAEZ 교육 도구"><meta name=keywords content="eventstorming, eventstorming2code, msa, micro service architecture,  microservicearchitecture"><meta name=viewport content="width=device-width,initial-scale=1"><!--[if IE]><link rel="icon" href="favicon.ico"><![endif]--><title>MSA Easy</title><link rel=stylesheet href=/github-markdown.css><link rel=stylesheet href=/global-style.css><script src=https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js></script><script src=https://cdn.jsdelivr.net/npm/lodash@4.17.11/lodash.min.js></script><script type=javascript src=static/lib/jqueryXML2JSON/jquery.xml2json.js></script><script type=javascript src=static/slimscroll/jquery.slimscroll.min.js></script><script src=https://apis.google.com/js/client.js></script><script src=https://apis.google.com/js/api.js></script><script src=https://apis.google.com/js/platform.js async defer></script><script src=https://www.gstatic.com/firebasejs/6.2.0/firebase-app.js></script><script src=https://code.jquery.com/jquery-1.12.4.min.js></script><script src=https://cdn.iamport.kr/js/iamport.payment-1.1.5.js></script><script src=https://www.gstatic.com/firebasejs/firebase/6.2.0/firebase-auth.js></script><script src=https://www.gstatic.com/firebasejs/firebase/6.2.0/firebase-firestore.js></script><script async src="https://www.googletagmanager.com/gtag/js?id=UA-153107610-1"></script><script src=https://unpkg.com/vue-i18n/dist/vue-i18n.js></script><script src=https://unpkg.com/vue-i18n@8></script><script src=https://code.jquery.com/ui/1.12.1/jquery-ui.min.js></script><link rel=stylesheet href=static/external/font-awesome.min.css><link rel=stylesheet href=static/external/fonts.css><link rel=stylesheet href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900"><link rel=stylesheet href="https://fonts.googleapis.com/css?family=Material+Icons"><link href=static/bpmn/css/bpmn.css rel=stylesheet type=text/css><link rel=stylesheet href=https://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.min.css><link rel=stylesheet type=text/css href=/static/lib/jquery-contextMenu/jquery.contextMenu.css><script src=https://cdn.trackjs.com/agent/v3/latest/t.js></script><link rel=stylesheet href=//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.18.1/styles/idea.min.css><script src=//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.18.1/highlight.min.js></script><link rel=stylesheet href=static/github-markdown.css><script defer src=https://cdn.jsdelivr.net/npm/acebase-client@latest/dist/browser.min.js></script><script defer src=static/lib/jquery-contextMenu/jquery.contextMenu.js></script><script defer src=https://use.fontawesome.com/releases/v5.2.0/js/all.js></script><script defer src=static/lib/opengraph/OpenGraph-0.1.3-SNAPSHOT.js></script><script src=static/external/marked.min.js></script><script src=static/external/ansi_up.min.js></script><script src=static/external/prism.js></script><script src=static/external/katex.min.js></script><script src=static/external/katex-auto-render.min.js></script><script src=static/external/notebook.min.js></script><script>var profile = 'local';
        var config = {};

        /**
         * Get profile from system env given by dcos
         */
        //gtag
        window.dataLayer = window.dataLayer || [];
        function gtag() {
            dataLayer.push(arguments);
        }
        gtag('js', new Date());
        gtag('config', 'UA-153107610-1');
        gtag('config', window.location.path);

        // $.ajax({
        //     url: "../static/env.txt",
        //     type: "get",
        //     async: false,
        //     success: function (data) {
        //         var lines = data.split('\n');
        //         $.each(lines, function (i, line) {
        //             if (line && line.indexOf('VUE_APP_API_HOST=') == 0) {
        //                 let value = line.split('=')[1];
        //                 window.API_HOST = value;
        //             }
        //             if (line && line.indexOf('VUE_APP_DB_HOST=') == 0) {
        //                 let value = line.split('=')[1];
        //                 window.DB_HOST = value;
        //             }
        //             if (line && line.indexOf('VUE_APP_DB_PORT=') == 0) {
        //                 let value = line.split('=')[1];
        //                 window.DB_PORT = value;
        //             }
        //             if (line && line.indexOf('VUE_APP_DB_NAME=') == 0) {
        //                 let value = line.split('=')[1];
        //                 window.DB_NAME = value;
        //             }
        //             if (line && line.indexOf('VUE_APP_CLUSTER_ADDRESS=') == 0) {
        //                 let value = line.split('=')[1];
        //                 window.CLUSTER_ADDRESS = value;
        //             }
        //             if (line && line.indexOf('VUE_APP_PROXY_SERVER=') == 0) {
        //                 let value = line.split('=')[1];
        //                 window.PROXY_SERVER = value;
        //             }
        //             if (line && line.indexOf('VUE_APP_MODE=') == 0) {
        //                 let value = line.split('=')[1];
        //                 window.MODE = value;
        //                 // if(value == "onprem") {
        //                 //     $('head').append('https://cdn.jsdelivr.net/npm/acebase-client@latest/dist/browser.min.js');
        //                 // }
        //             }
        //         });
        //     },
        //     error: function (e) {
        //         console.log('Failed to get env',e);
        //     }
        // });</script><link rel=stylesheet href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900"><link rel=stylesheet href="https://fonts.googleapis.com/css?family=Material+Icons"><link rel=stylesheet href=//cdn.materialdesignicons.com/5.0.45/css/materialdesignicons.min.css><link href=/css/BigEventStorming.c0c49896.css rel=prefetch><link href=/css/BigEventStorming~BpmnModelCanvas~BusinessModelCanvas~ClassModeler~ClassRoom~EventStorming~Kubernetes~8713f7ca.164291af.css rel=prefetch><link href=/css/BigEventStorming~BpmnModelCanvas~BusinessModelCanvas~ClassModeler~ClassRoom~EventStorming~LabLocator~a2e89356.3855e452.css rel=prefetch><link href=/css/BigEventStorming~BusinessModelCanvas~ClassModeler~ClassRoom~EventStorming~KubernetesModelCanvas~LabL~6a2e30e1.cbdf32d1.css rel=prefetch><link href=/css/BpmnModelCanvas.cbdf3979.css rel=prefetch><link href=/css/BusinessModelCanvas.ea10411b.css rel=prefetch><link href=/css/ClassModeler.88e16439.css rel=prefetch><link href=/css/ClassRoom.78bb2bf6.css rel=prefetch><link href=/css/ClassRounge.d007f35d.css rel=prefetch><link href=/css/ClassRounge~StickyModelCanvas.98320b2e.css rel=prefetch><link href=/css/EventStorming.c0c49896.css rel=prefetch><link href=/css/IdeLoadingPage.41c8ac87.css rel=prefetch><link href=/css/KubernetesModelCanvas.3eebc378.css rel=prefetch><link href=/css/LabLocator.8e83ad88.css rel=prefetch><link href=/css/ProcessDesigner.c2505722.css rel=prefetch><link href=/css/ReplayPortal.9cdccf5f.css rel=prefetch><link href=/css/SignInHelper.c1aab3e8.css rel=prefetch><link href=/css/StickyModelCanvas.167fda9f.css rel=prefetch><link href=/js/BigEventStorming.9e1825c3.js rel=prefetch><link href=/js/BigEventStorming~BpmnModelCanvas~BusinessModelCanvas~ClassModeler~ClassRoom~EventStorming~Kubernetes~8713f7ca.49ce70d2.js rel=prefetch><link href=/js/BigEventStorming~BpmnModelCanvas~BusinessModelCanvas~ClassModeler~ClassRoom~EventStorming~Kubernetes~b87d1b0b.6c841a56.js rel=prefetch><link href=/js/BigEventStorming~BpmnModelCanvas~BusinessModelCanvas~ClassModeler~ClassRoom~EventStorming~LabLocator~a2e89356.66e6c642.js rel=prefetch><link href=/js/BigEventStorming~BusinessModelCanvas~ClassModeler~ClassRoom~EventStorming~KubernetesModelCanvas~LabL~6a2e30e1.b747630a.js rel=prefetch><link href=/js/BpmnModelCanvas.b91b11ac.js rel=prefetch><link href=/js/BusinessModelCanvas.bf40e8eb.js rel=prefetch><link href=/js/ClassModeler.afd8b3d2.js rel=prefetch><link href=/js/ClassRoom.533e9df7.js rel=prefetch><link href=/js/ClassRounge.3200de2a.js rel=prefetch><link href=/js/ClassRounge~StickyModelCanvas.602b2bfa.js rel=prefetch><link href=/js/EventModeler.e9577f66.js rel=prefetch><link href=/js/EventStorming.d53ac65d.js rel=prefetch><link href=/js/IdeLoadingPage.78f9dcdb.js rel=prefetch><link href=/js/KubernetesModelCanvas.948f35c6.js rel=prefetch><link href=/js/LabLocator.c0579011.js rel=prefetch><link href=/js/LabPortal.075c02df.js rel=prefetch><link href=/js/LoginPage.56eaa585.js rel=prefetch><link href=/js/ManagePurchaseItemListPage.391565cd.js rel=prefetch><link href=/js/MyPageManager.538d637e.js rel=prefetch><link href=/js/PersonalInfo.da6898f2.js rel=prefetch><link href=/js/ProcessDesigner.53aa5d62.js rel=prefetch><link href=/js/Provision.4f8dbf37.js rel=prefetch><link href=/js/ReplayPortal.b08c13b8.js rel=prefetch><link href=/js/SignInHelper.cc5955d5.js rel=prefetch><link href=/js/StickyModelCanvas.311470b2.js rel=prefetch><link href=/js/chunk-155268a8.44e9ccce.js rel=prefetch><link href=/js/chunk-2d0a3149.03c5ab30.js rel=prefetch><link href=/js/chunk-2d0a32e7.e5179723.js rel=prefetch><link href=/js/chunk-2d0a4b4f.c6f43652.js rel=prefetch><link href=/js/chunk-2d0a4f3d.bd280aee.js rel=prefetch><link href=/js/chunk-2d0aa633.378140df.js rel=prefetch><link href=/js/chunk-2d0aabd6.543c05df.js rel=prefetch><link href=/js/chunk-2d0ac354.240b9467.js rel=prefetch><link href=/js/chunk-2d0b16cd.e5e2bd7a.js rel=prefetch><link href=/js/chunk-2d0b218a.c26c101d.js rel=prefetch><link href=/js/chunk-2d0b2725.5070d489.js rel=prefetch><link href=/js/chunk-2d0b5f38.325e3357.js rel=prefetch><link href=/js/chunk-2d0b5fd1.d0b86234.js rel=prefetch><link href=/js/chunk-2d0b654b.0590b927.js rel=prefetch><link href=/js/chunk-2d0c06a5.acd307a2.js rel=prefetch><link href=/js/chunk-2d0c4db7.25ee4b51.js rel=prefetch><link href=/js/chunk-2d0c515d.b2a65569.js rel=prefetch><link href=/js/chunk-2d0cb76d.d9a0015d.js rel=prefetch><link href=/js/chunk-2d0d0474.9238777b.js rel=prefetch><link href=/js/chunk-2d0d2b72.62464703.js rel=prefetch><link href=/js/chunk-2d0d2e88.c1a6a490.js rel=prefetch><link href=/js/chunk-2d0d6e5d.fd5ffae1.js rel=prefetch><link href=/js/chunk-2d0d7804.832c3d86.js rel=prefetch><link href=/js/chunk-2d0daf4f.80744f48.js rel=prefetch><link href=/js/chunk-2d0db816.7912cc3d.js rel=prefetch><link href=/js/chunk-2d0dd64f.e32191b4.js rel=prefetch><link href=/js/chunk-2d0dd7df.2ff27d85.js rel=prefetch><link href=/js/chunk-2d0e4510.688e6cc6.js rel=prefetch><link href=/js/chunk-2d0e5949.f2713355.js rel=prefetch><link href=/js/chunk-2d0e5985.60b234e2.js rel=prefetch><link href=/js/chunk-2d0e59b0.601b8e8d.js rel=prefetch><link href=/js/chunk-2d0e883d.800e6de3.js rel=prefetch><link href=/js/chunk-2d0e8e3f.e2cf4a52.js rel=prefetch><link href=/js/chunk-2d2076e9.810aa2f5.js rel=prefetch><link href=/js/chunk-2d2077f0.97348036.js rel=prefetch><link href=/js/chunk-2d207ba3.4c688dd9.js rel=prefetch><link href=/js/chunk-2d208d9e.d54872a8.js rel=prefetch><link href=/js/chunk-2d20ed73.45994c5b.js rel=prefetch><link href=/js/chunk-2d20ee04.85193d5c.js rel=prefetch><link href=/js/chunk-2d212fb6.b0948fbe.js rel=prefetch><link href=/js/chunk-2d213185.9a23d0ea.js rel=prefetch><link href=/js/chunk-2d21449a.6f95f91a.js rel=prefetch><link href=/js/chunk-2d21684f.b8b30468.js rel=prefetch><link href=/js/chunk-2d217118.dc35f81b.js rel=prefetch><link href=/js/chunk-2d2172c8.34400dad.js rel=prefetch><link href=/js/chunk-2d2174db.bb4b1f4a.js rel=prefetch><link href=/js/chunk-2d217aa9.ae8acf7e.js rel=prefetch><link href=/js/chunk-2d21dc90.d45475c3.js rel=prefetch><link href=/js/chunk-2d21e73c.a1b97d82.js rel=prefetch><link href=/js/chunk-2d222cf8.805dd3c1.js rel=prefetch><link href=/js/chunk-2d225f5a.a7e110e1.js rel=prefetch><link href=/js/chunk-2d22691a.0622966a.js rel=prefetch><link href=/js/chunk-2d229b9a.367c3780.js rel=prefetch><link href=/js/chunk-2d22d0b0.122befeb.js rel=prefetch><link href=/js/chunk-2d23055f.a9b72765.js rel=prefetch><link href=/js/chunk-2d230c43.108b8334.js rel=prefetch><link href=/js/chunk-2d230e24.be1462ea.js rel=prefetch><link href=/js/chunk-2d237b6e.59c29421.js rel=prefetch><link href=/js/chunk-2d23804a.811b351a.js rel=prefetch><link href=/js/chunk-2d238498.ebe3c505.js rel=prefetch><link href=/js/chunk-34e4b8d2.9d9a698b.js rel=prefetch><link href=/js/chunk-51826664.771d7411.js rel=prefetch><link href=/js/chunk-743d92d0.63449007.js rel=prefetch><link href=/js/chunk-76ffbeee.f23b48d8.js rel=prefetch><link href=/js/chunk-98234524.e97e7040.js rel=prefetch><link href=/js/labAdminTest.541b1f13.js rel=prefetch><link href=/js/labMonitoring.77c68d2b.js rel=prefetch><link href=/js/startelectron.ebb9a696.js rel=prefetch><link href=/css/app.f781cd82.css rel=preload as=style><link href=/css/chunk-vendors.a0c81b6d.css rel=preload as=style><link href=/js/app.76398d81.js rel=preload as=script><link href=/js/chunk-vendors.9bd70230.js rel=preload as=script><link href=/css/chunk-vendors.a0c81b6d.css rel=stylesheet><link href=/css/app.f781cd82.css rel=stylesheet><link rel=icon type=image/png sizes=32x32 href=/img/icons/favicon-32x32.png><link rel=icon type=image/png sizes=16x16 href=/img/icons/favicon-16x16.png><link rel=manifest href=/manifest.json><meta name=theme-color content=#4DBA87><meta name=apple-mobile-web-app-capable content=no><meta name=apple-mobile-web-app-status-bar-style content=default><meta name=apple-mobile-web-app-title content=service-ui><link rel=apple-touch-icon href=/img/icons/apple-touch-icon-152x152.png><link rel=mask-icon href=/img/icons/safari-pinned-tab.svg color=#4DBA87><meta name=msapplication-TileImage content=/img/icons/msapplication-icon-144x144.png><meta name=msapplication-TileColor content=#000000></head><body><script>// window.GitpleConfig = {appCode: '0XY0AvdJ820MDsNwIZuJIgQqdn1kc3'};
    // !function () {
    //     function e() {
    //         function e() {
    //             var e = t.contentDocument, a = e.createElement("script");
    //             a.type = "text/javascript", a.async = !0, a.src = window[n] && window[n].url ? window[n].url + "/inapp-web/gitple-loader.js" : "https://app.gitple.io/inapp-web/gitple-loader.js", a.charset = "UTF-8", e.head && e.head.appendChild(a)
    //         }
    //
    //         var t = document.getElementById(a);
    //         t || ((t = document.createElement("iframe")).id = a, t.style.display = "none", t.style.width = "0", t.style.height = "0", t.addEventListener ? t.addEventListener("load", e, !1) : t.attachEvent ? t.attachEvent("onload", e) : t.onload = e, document.body.appendChild(t))
    //     }
    //
    //     var t = window, n = "GitpleConfig", a = "gitple-loader-frame";
    //     if (!window.Gitple) {
    //         document;
    //         var i = function () {
    //             i.ex && i.ex(arguments)
    //         };
    //         i.q = [], i.ex = function (e) {
    //             i.processApi ? i.processApi.apply(void 0, e) : i.q && i.q.push(e)
    //         }, window.Gitple = i, t.attachEvent ? t.attachEvent("onload", e) : t.addEventListener("load", e, !1)
    //     }
    // }();
    // console.log("init")
    // Gitple('boot');</script><noscript><strong>We're sorry but service-ui doesn't work properly without JavaScript enabled. Please enable it to continue.</strong></noscript><div id=app></div><script src=/js/chunk-vendors.9bd70230.js></script><script src=/js/app.76398d81.js></script></body></html>